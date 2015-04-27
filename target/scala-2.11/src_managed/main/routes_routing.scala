// @SOURCE:/Users/mj/workspace/play-oauth2/conf/routes
// @HASH:af95662c07d016d92d40b7ad1830002c9920253e
// @DATE:Mon Apr 27 10:35:29 GMT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("",securesocial.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val securesocial_controllers_LoginPage_login0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val securesocial_controllers_LoginPage_login0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).login,
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
        

// @LINE:7
private[this] lazy val securesocial_controllers_LoginPage_logout1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val securesocial_controllers_LoginPage_logout1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).logout,
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:9
private[this] lazy val controllers_Application_index2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:12
private[this] lazy val securesocial_controllers_ProviderController_authenticate3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val securesocial_controllers_ProviderController_authenticate3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticate(fakeValue[String], fakeValue[Option[String]]),
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String], classOf[Option[String]]),"GET", """ Authentication entry points for all providers""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:13
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticateByPost(fakeValue[String], fakeValue[Option[String]]),
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String], classOf[Option[String]]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:15
private[this] lazy val securesocial_controllers_LoginApi_authenticate5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val securesocial_controllers_LoginApi_authenticate5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginApi]).authenticate(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginApi", "authenticate", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """api/authenticate/$provider<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:25
private[this] lazy val securesocial_controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val securesocial_controllers_Assets_at7_invoker = createInvoker(
securesocial.controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:27
lazy val securesocial_Routes8 = Include(securesocial.Routes)
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""@securesocial.controllers.LoginPage@.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""@securesocial.controllers.LoginPage@.logout"""),("""GET""", prefix,"""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""@securesocial.controllers.ProviderController@.authenticate(provider:String, redirectTo:Option[String])"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""@securesocial.controllers.ProviderController@.authenticateByPost(provider:String, redirectTo:Option[String])"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/authenticate/$provider<[^/]+>""","""@securesocial.controllers.LoginApi@.authenticate(provider:String, builder:String = "token")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""securesocial.controllers.Assets.at(path:String = "/public/securesocial", file:String)"""),securesocial.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case securesocial_controllers_LoginPage_login0_route(params) => {
   call { 
        securesocial_controllers_LoginPage_login0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).login)
   }
}
        

// @LINE:7
case securesocial_controllers_LoginPage_logout1_route(params) => {
   call { 
        securesocial_controllers_LoginPage_logout1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).logout)
   }
}
        

// @LINE:9
case controllers_Application_index2_route(params) => {
   call { 
        controllers_Application_index2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index)
   }
}
        

// @LINE:12
case securesocial_controllers_ProviderController_authenticate3_route(params) => {
   call(params.fromPath[String]("provider", None), params.fromQuery[Option[String]]("redirectTo", None)) { (provider, redirectTo) =>
        securesocial_controllers_ProviderController_authenticate3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticate(provider, redirectTo))
   }
}
        

// @LINE:13
case securesocial_controllers_ProviderController_authenticateByPost4_route(params) => {
   call(params.fromPath[String]("provider", None), params.fromQuery[Option[String]]("redirectTo", None)) { (provider, redirectTo) =>
        securesocial_controllers_ProviderController_authenticateByPost4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticateByPost(provider, redirectTo))
   }
}
        

// @LINE:15
case securesocial_controllers_LoginApi_authenticate5_route(params) => {
   call(params.fromPath[String]("provider", None), Param[String]("builder", Right("token"))) { (provider, builder) =>
        securesocial_controllers_LoginApi_authenticate5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginApi]).authenticate(provider, builder))
   }
}
        

// @LINE:24
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:25
case securesocial_controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public/securesocial")), params.fromPath[String]("file", None)) { (path, file) =>
        securesocial_controllers_Assets_at7_invoker.call(securesocial.controllers.Assets.at(path, file))
   }
}
        

// @LINE:27
case securesocial_Routes8(handler) => handler
        
}

}
     