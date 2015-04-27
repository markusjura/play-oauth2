package models

import play.api.libs.json.Json
import securesocial.core._

case class DemoUser(main: BasicProfile, identities: List[BasicProfile])

object DemoUser {

  implicit val authenticationMethodFormat = Json.format[AuthenticationMethod]
  implicit val oAuth1InfoFormat = Json.format[OAuth1Info]
  implicit val oAuth2InfoFormat = Json.format[OAuth2Info]
  implicit val basicPasswordInfoFormat = Json.format[PasswordInfo]
  implicit val basicProfileFormat = Json.format[BasicProfile]
  implicit val demoUserFormat = Json.format[DemoUser]
}