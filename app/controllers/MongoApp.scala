package controllers

import play.api._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json._
import scala.concurrent.Future
import reactivemongo.api._
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection
import models._
import models.JsonFormats._

object MongoApp extends Controller with MongoController {

  def collection: JSONCollection = db.collection[JSONCollection]("persons")

  def create = Action.async {
    val user = User(29, "John", "Smith", List(
      Feed("Slashdot news", "http://slashdot.org/slashdot.rdf")))
    val futureResult = collection.insert(user)
    futureResult.map(_ => Ok)
  }

  def createFromJson = Action.async(parse.json) { request =>
    request.body.validate[User].map { user =>
      collection.insert(user).map { lastError =>
        Logger.debug(s"Successfully inserted with LastError: $lastError")
        Created
      }
    }.getOrElse(Future.successful(BadRequest("invalid json")))
  }

  def findByName(lastName: String) = Action.async {
    val cursor: Cursor[User] = collection
      .find(Json.obj("lastName" -> lastName))
      .sort(Json.obj("created" -> -1))
      .cursor[User]

    val futureUsersList: Future[List[User]] = cursor.collect[List]()

    futureUsersList.map { persons =>
      Ok(persons.toString)
    }
  }
}