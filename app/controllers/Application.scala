package controllers

import securesocial.core.RuntimeEnvironment
import services.DemoUser

class Application(override implicit val env: RuntimeEnvironment[DemoUser]) extends securesocial.core.SecureSocial[DemoUser] {

  def index = SecuredAction { implicit request =>
    Ok(views.html.index(request.user.main))
  }
}
