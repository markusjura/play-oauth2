package controllers

import play.api.Logger
import play.api.mvc.Action
import securesocial.core.RuntimeEnvironment
import models.DemoUser

class Application(override implicit val env: RuntimeEnvironment[DemoUser]) extends securesocial.core.SecureSocial[DemoUser] {
  def index = SecuredAction { implicit request =>
    Ok(views.html.index(request.user.main))
  }
}
