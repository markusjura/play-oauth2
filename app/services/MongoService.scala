package services

import play.api.Logger
import play.api.libs.json.Json
import play.modules.reactivemongo.{ReactiveMongoPlugin}
import play.modules.reactivemongo.json.collection.JSONCollection
import securesocial.core._
import securesocial.core.providers.{ MailToken }
import scala.concurrent.Future
import securesocial.core.services.{ UserService, SaveMode }
import models._
import play.api.Play.current
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class MongoService extends UserService[DemoUser] {

  val log = Logger(this.getClass)

  /** Returns the current instance of the driver. */
  def driver = ReactiveMongoPlugin.driver
  /** Returns the current MongoConnection instance (the connection pool manager). */
  def connection = ReactiveMongoPlugin.connection
  /** Returns the default database (as specified in `application.conf`). */
  def db = ReactiveMongoPlugin.db
  // Collection name
  def collection: JSONCollection = db.collection[JSONCollection]("users")

  var users = Map[(String, String), DemoUser]()
  //private var identities = Map[String, BasicProfile]()
  private var tokens = Map[String, MailToken]()

  def find(providerId: String, userId: String): Future[Option[BasicProfile]] = {
    log.debug("find: users = %s".format(users))

    val result = for {
      user <- users.values
      basicProfile <- user.identities.find(su => su.providerId == providerId && su.userId == userId)
    } yield {
        basicProfile
      }
    Future.successful(result.headOption)
  }

  def save(user: BasicProfile, mode: SaveMode): Future[DemoUser] = {
    def findProfile(p: BasicProfile): Future[Option[DemoUser]] =
      collection.find(Json.obj("identities.userId" -> p.userId)).cursor[DemoUser].headOption

    def updateProfile(existingUser: DemoUser): Future[DemoUser] =
      Future.successful(existingUser)

    log.debug(s"save: user = $user")

    mode match {
      case SaveMode.SignUp =>
        val newUser = DemoUser(user, List(user))
        collection.insert(newUser).map(_ => newUser)
      case SaveMode.LoggedIn =>
        // first see if there is a user with this BasicProfile already.
        findProfile(user).flatMap {
          case Some(existingUser) =>
            updateProfile(existingUser)

          case None =>
            val newUser = DemoUser(user, List(user))
            collection.insert(newUser).map(_ => newUser)
        }

      case SaveMode.PasswordChange =>
        findProfile(user).flatMap { entry => updateProfile(entry.head) }
    }
  }








  /**
   * Not needed in this example
   */
  override def findByEmailAndProvider(email: String, providerId: String): Future[Option[BasicProfile]] = ???

  override def deleteToken(uuid: String): Future[Option[MailToken]] = ???

  override def link(current: DemoUser, to: BasicProfile): Future[DemoUser] = ???

  override def passwordInfoFor(user: DemoUser): Future[Option[PasswordInfo]] = ???

  override def findToken(token: String): Future[Option[MailToken]] = ???

  override def deleteExpiredTokens(): Unit = ???

  override def updatePasswordInfo(user: DemoUser, info: PasswordInfo): Future[Option[BasicProfile]] = ???

  override def saveToken(token: MailToken): Future[MailToken] = ???
}

