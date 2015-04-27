// @SOURCE:/Users/mj/workspace/play-oauth2/conf/routes
// @HASH:c508132d9e9b19ceab6ed4eb7abd328bc8129b09
// @DATE:Mon Apr 27 10:48:10 GMT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:34
// @LINE:9
package controllers {

// @LINE:34
class ReverseAssets {


// @LINE:34
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
                  

// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers {

// @LINE:35
class ReverseAssets {


// @LINE:35
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/securesocial")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
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
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseRegistration {


// @LINE:19
def handleStartSignUp(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:18
def startSignUp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:21
def handleSignUp(mailToken:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("mailToken", dynamicString(mailToken)))
}
                        

// @LINE:20
def signUp(mailToken:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("mailToken", dynamicString(mailToken)))
}
                        

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReversePasswordReset {


// @LINE:26
def resetPassword(mailToken:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("mailToken", dynamicString(mailToken)))
}
                        

// @LINE:27
def handleResetPassword(mailToken:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("mailToken", dynamicString(mailToken)))
}
                        

// @LINE:24
def startResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reset")
}
                        

// @LINE:25
def handleStartResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reset")
}
                        

}
                          

// @LINE:15
class ReverseLoginApi {


// @LINE:15
def authenticate(provider:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("builder", "token")))
   Call("POST", _prefix + { _defaultPrefix } + "api/authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

}
                          

// @LINE:31
// @LINE:30
class ReversePasswordChange {


// @LINE:31
def handlePasswordChange(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "password")
}
                        

// @LINE:30
def page(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "password")
}
                        

}
                          
}
                  


// @LINE:34
// @LINE:9
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:34
class ReverseAssets {


// @LINE:34
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
        

// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers.javascript {
import ReverseRouteContext.empty

// @LINE:35
class ReverseAssets {


// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
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
              

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseRegistration {


// @LINE:19
def handleStartSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:18
def startSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:21
def handleSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(mailToken) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mailToken", encodeURIComponent(mailToken))})
      }
   """
)
                        

// @LINE:20
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(mailToken) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mailToken", encodeURIComponent(mailToken))})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReversePasswordReset {


// @LINE:26
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordReset.resetPassword",
   """
      function(mailToken) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mailToken", encodeURIComponent(mailToken))})
      }
   """
)
                        

// @LINE:27
def handleResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordReset.handleResetPassword",
   """
      function(mailToken) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mailToken", encodeURIComponent(mailToken))})
      }
   """
)
                        

// @LINE:24
def startResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordReset.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:25
def handleStartResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordReset.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

}
              

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
              

// @LINE:31
// @LINE:30
class ReversePasswordChange {


// @LINE:31
def handlePasswordChange : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        

// @LINE:30
def page : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        

}
              
}
        


// @LINE:34
// @LINE:9
package controllers.ref {


// @LINE:34
class ReverseAssets {


// @LINE:34
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
        

// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
package securesocial.controllers.ref {


// @LINE:35
class ReverseAssets {


// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
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
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseRegistration {


// @LINE:19
def handleStartSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.Registration]).handleStartSignUp(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Registration", "handleStartSignUp", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:18
def startSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.Registration]).startSignUp(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Registration", "startSignUp", Seq(), "GET", """ Registration routes""", _prefix + """signup""")
)
                      

// @LINE:21
def handleSignUp(mailToken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.Registration]).handleSignUp(mailToken), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]), "POST", """""", _prefix + """signup/$mailToken<[^/]+>""")
)
                      

// @LINE:20
def signUp(mailToken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.Registration]).signUp(mailToken), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.Registration", "signUp", Seq(classOf[String]), "GET", """""", _prefix + """signup/$mailToken<[^/]+>""")
)
                      

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReversePasswordReset {


// @LINE:26
def resetPassword(mailToken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordReset]).resetPassword(mailToken), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordReset", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """reset/$mailToken<[^/]+>""")
)
                      

// @LINE:27
def handleResetPassword(mailToken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordReset]).handleResetPassword(mailToken), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordReset", "handleResetPassword", Seq(classOf[String]), "POST", """""", _prefix + """reset/$mailToken<[^/]+>""")
)
                      

// @LINE:24
def startResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordReset]).startResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordReset", "startResetPassword", Seq(), "GET", """ Reset password""", _prefix + """reset""")
)
                      

// @LINE:25
def handleStartResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordReset]).handleStartResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordReset", "handleStartResetPassword", Seq(), "POST", """""", _prefix + """reset""")
)
                      

}
                          

// @LINE:15
class ReverseLoginApi {


// @LINE:15
def authenticate(provider:String, builder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.LoginApi]).authenticate(provider, builder), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.LoginApi", "authenticate", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """api/authenticate/$provider<[^/]+>""")
)
                      

}
                          

// @LINE:31
// @LINE:30
class ReversePasswordChange {


// @LINE:31
def handlePasswordChange(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordChange]).handlePasswordChange(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq(), "POST", """""", _prefix + """password""")
)
                      

// @LINE:30
def page(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[securesocial.controllers.PasswordChange]).page(), HandlerDef(this.getClass.getClassLoader, "", "securesocial.controllers.PasswordChange", "page", Seq(), "GET", """ Change Password""", _prefix + """password""")
)
                      

}
                          
}
        
    