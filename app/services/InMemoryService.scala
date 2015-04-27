package services

import play.api.Logger
import securesocial.core._
import securesocial.core.providers.{ UsernamePasswordProvider, MailToken }
import scala.concurrent.Future
import securesocial.core.services.{ UserService, SaveMode }
import models._

class InMemoryUserService extends UserService[DemoUser] {

  val log = Logger(this.getClass)

  var users = Map[(String, String), DemoUser]()
//  private var tokens = Map[String, MailToken]()

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
    def findProfile(p: BasicProfile) = {
      users.find {
        case (key, value) if value.identities.exists(su => su.providerId == p.providerId && su.userId == p.userId) => true
        case _ => false
      }
    }

    def updateProfile(user: BasicProfile, entry: ((String, String), DemoUser)): Future[DemoUser] = {
      val identities = entry._2.identities
      val updatedList = identities.patch(identities.indexWhere(i => i.providerId == user.providerId && i.userId == user.userId), Seq(user), 1)
      val updatedUser = entry._2.copy(identities = updatedList)
      users = users + (entry._1 -> updatedUser)
      Future.successful(updatedUser)
    }

    log.debug(s"save: user = $user")

    mode match {
      case SaveMode.SignUp =>
        val newUser = DemoUser(user, List(user))
        users = users + ((user.providerId, user.userId) -> newUser)
        Future.successful(newUser)
      case SaveMode.LoggedIn =>
        // first see if there is a user with this BasicProfile already.
        findProfile(user) match {
          case Some(existingUser) =>
            updateProfile(user, existingUser)

          case None =>
            val newUser = DemoUser(user, List(user))
            users = users + ((user.providerId, user.userId) -> newUser)
            Future.successful(newUser)
        }

      case SaveMode.PasswordChange =>
        findProfile(user).map { entry => updateProfile(user, entry) }.getOrElse(
          // this should not happen as the profile will be there
          throw new Exception("missing profile)")
        )
    }
  }

  override def findByEmailAndProvider(email: String, providerId: String): Future[Option[BasicProfile]] = ???

  override def deleteToken(uuid: String): Future[Option[MailToken]] = ???

  override def link(current: DemoUser, to: BasicProfile): Future[DemoUser] = ???

  override def passwordInfoFor(user: DemoUser): Future[Option[PasswordInfo]] = ???

  override def findToken(token: String): Future[Option[MailToken]] = ???

  override def deleteExpiredTokens(): Unit = ???

  override def updatePasswordInfo(user: DemoUser, info: PasswordInfo): Future[Option[BasicProfile]] = ???

  override def saveToken(token: MailToken): Future[MailToken] = ???
}

