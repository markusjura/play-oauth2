import play.api.GlobalSettings
import java.lang.reflect.Constructor
import securesocial.core.RuntimeEnvironment
import securesocial.core.providers.{GitHubProvider, GoogleProvider}
import services._
import models.DemoUser

import scala.collection.immutable.ListMap

object Global extends GlobalSettings {

  object MyRuntimeEnvironment extends RuntimeEnvironment.Default[DemoUser] {
    override implicit val executionContext = play.api.libs.concurrent.Execution.defaultContext
//    override lazy val userService: InMemoryUserService = new InMemoryUserService()
    override lazy val userService: MongoService = new MongoService()
    override lazy val eventListeners = List(new MyEventListener())
    override lazy val providers = ListMap(
      include(new GoogleProvider(routes, cacheService, oauth2ClientFor(GoogleProvider.Google))),
      include(new GitHubProvider(routes, cacheService, oauth2ClientFor(GitHubProvider.GitHub)))
    )
  }

  override def getControllerInstance[A](controllerClass: Class[A]): A = {
    val instance = controllerClass.getConstructors.find { c =>
      val params = c.getParameterTypes
      params.length == 1 && params(0) == classOf[RuntimeEnvironment[DemoUser]]
    }.map {
      _.asInstanceOf[Constructor[A]].newInstance(MyRuntimeEnvironment)
    }
    instance.getOrElse(super.getControllerInstance(controllerClass))
  }
}
