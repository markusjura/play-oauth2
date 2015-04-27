// @SOURCE:/Users/mj/workspace/play-oauth2/conf/routes
// @HASH:ce2d186adc46fc967f38d2e1683c4bdbf9d5fcc9
// @DATE:Mon Apr 27 13:59:23 GMT 2015


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


// @LINE:5
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val securesocial_controllers_LoginPage_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val securesocial_controllers_LoginPage_login1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).login,
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
        

// @LINE:9
private[this] lazy val securesocial_controllers_LoginPage_logout2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val securesocial_controllers_LoginPage_logout2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).logout,
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

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
        

// @LINE:18
private[this] lazy val controllers_MongoApp_create6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mongo/create"))))
private[this] lazy val controllers_MongoApp_create6_invoker = createInvoker(
controllers.MongoApp.create,
HandlerDef(this.getClass.getClassLoader, "", "controllers.MongoApp", "create", Nil,"GET", """ Mongo Test""", Routes.prefix + """mongo/create"""))
        

// @LINE:19
private[this] lazy val controllers_MongoApp_findByName7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mongo/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_MongoApp_findByName7_invoker = createInvoker(
controllers.MongoApp.findByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MongoApp", "findByName", Seq(classOf[String]),"GET", """""", Routes.prefix + """mongo/$name<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:23
private[this] lazy val securesocial_controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val securesocial_controllers_Assets_at9_invoker = createInvoker(
securesocial.controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:25
lazy val securesocial_Routes10 = Include(securesocial.Routes)
        
def documentation = List(("""GET""", prefix,"""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""@securesocial.controllers.LoginPage@.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""@securesocial.controllers.LoginPage@.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""@securesocial.controllers.ProviderController@.authenticate(provider:String, redirectTo:Option[String])"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""@securesocial.controllers.ProviderController@.authenticateByPost(provider:String, redirectTo:Option[String])"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/authenticate/$provider<[^/]+>""","""@securesocial.controllers.LoginApi@.authenticate(provider:String, builder:String = "token")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mongo/create""","""controllers.MongoApp.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mongo/$name<[^/]+>""","""controllers.MongoApp.findByName(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""securesocial.controllers.Assets.at(path:String = "/public/securesocial", file:String)"""),securesocial.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index)
   }
}
        

// @LINE:8
case securesocial_controllers_LoginPage_login1_route(params) => {
   call { 
        securesocial_controllers_LoginPage_login1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).login)
   }
}
        

// @LINE:9
case securesocial_controllers_LoginPage_logout2_route(params) => {
   call { 
        securesocial_controllers_LoginPage_logout2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).logout)
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
        

// @LINE:18
case controllers_MongoApp_create6_route(params) => {
   call { 
        controllers_MongoApp_create6_invoker.call(controllers.MongoApp.create)
   }
}
        

// @LINE:19
case controllers_MongoApp_findByName7_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_MongoApp_findByName7_invoker.call(controllers.MongoApp.findByName(name))
   }
}
        

// @LINE:22
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:23
case securesocial_controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public/securesocial")), params.fromPath[String]("file", None)) { (path, file) =>
        securesocial_controllers_Assets_at9_invoker.call(securesocial.controllers.Assets.at(path, file))
   }
}
        

// @LINE:25
case securesocial_Routes10(handler) => handler
        
}

}
     