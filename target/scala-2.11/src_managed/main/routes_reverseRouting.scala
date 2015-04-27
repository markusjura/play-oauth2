// @SOURCE:/Users/mj/workspace/play24/conf/routes
// @HASH:70ae786c9a8795a913e9e5eb07cbd6c9a32b51d6
// @DATE:Sun Apr 26 10:52:32 GMT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:24
// @LINE:9
package controllers {

// @LINE:24
class ReverseAssets {


// @LINE:24
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:9
class ReverseApplication {


// @LINE:9
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers {

// @LINE:15
class ReverseLoginApi {


// @LINE:15
def authenticate(provider:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("builder", "token")))
   Call("POST", _prefix + { _defaultPrefix } + "api/authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

}
                          

// @LINE:13
// @LINE:12
class ReverseProviderController {


// @LINE:13
def authenticateByPost(provider:String, redirectTo:Option[String]): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("redirectTo", redirectTo)))))
}
                        

// @LINE:12
def authenticate(provider:String, redirectTo:Option[String]): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("redirectTo", redirectTo)))))
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseLoginPage {


// @LINE:7
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:24
// @LINE:9
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:24
class ReverseAssets {


// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:9
class ReverseApplication {


// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseLoginApi {


// @LINE:15
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginApi.authenticate",
   """
      function(provider) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
class ReverseProviderController {


// @LINE:13
def authenticateByPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider,redirectTo) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("redirectTo", redirectTo)])})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider,redirectTo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("redirectTo", redirectTo)])})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseLoginPage {


// @LINE:7
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:24
// @LINE:9
package controllers.ref {


// @LINE:24
class ReverseAssets {


// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
class ReverseApplication {


// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          
}
        

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers.ref {


// @LINE:15
class ReverseLoginApi {


// @LINE:15
def authenticate(provider:String, builder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginApi]).authenticate(provider, builder), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginApi", "authenticate", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """api/authenticate/$provider<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
class ReverseProviderController {


// @LINE:13
def authenticateByPost(provider:String, redirectTo:Option[String]): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticateByPost(provider, redirectTo), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String], classOf[Option[String]]), "POST", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:12
def authenticate(provider:String, redirectTo:Option[String]): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.ProviderController]).authenticate(provider, redirectTo), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String], classOf[Option[String]]), "GET", """ Authentication entry points for all providers""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseLoginPage {


// @LINE:7
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).logout(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginPage]).login(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginPage", "login", Seq(), "GET", """ Login page""", _prefix + """login""")
)
                      

}
                          
}
        
    