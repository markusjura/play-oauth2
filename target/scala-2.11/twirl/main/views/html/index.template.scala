
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[securesocial.core.BasicProfile,RequestHeader,securesocial.core.RuntimeEnvironment[services.DemoUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: securesocial.core.BasicProfile)(implicit request: RequestHeader, env: securesocial.core.RuntimeEnvironment[services.DemoUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import securesocial.core.IdentityProvider
import securesocial.core.IdentityProvider
import securesocial.core.providers.UsernamePasswordProvider
import securesocial.core.AuthenticationMethod._
import play.api.{Logger, Play}
import helper._
import play.api.Play

Seq[Any](format.raw/*1.135*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*10.1*/("""
"""),_display_(/*11.2*/main("SecureSocial - Sample Protected Page")/*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
  """),format.raw/*12.3*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*13.20*/user/*13.24*/.avatarUrl.getOrElse("")),format.raw/*13.48*/("""" alt=""""),_display_(/*13.56*/user/*13.60*/.firstName.getOrElse("")),format.raw/*13.84*/("""" width="40px" height="40px"/> Welcome """),_display_(/*13.124*/user/*13.128*/.firstName.getOrElse("")),format.raw/*13.152*/("""</h2>
  </div>

  <div class="clearfix">
    <h2>User Details</h2>

    <ul>
      <li>User Id: """),_display_(/*20.21*/user/*20.25*/.userId),format.raw/*20.32*/("""</li>
      <li>Fist name: """),_display_(/*21.23*/user/*21.27*/.firstName.getOrElse("")),format.raw/*21.51*/("""</li>
      <li>Last name: """),_display_(/*22.23*/user/*22.27*/.lastName),format.raw/*22.36*/(""".</li>
      <li>Full name: """),_display_(/*23.23*/user/*23.27*/.fullName.getOrElse("")),format.raw/*23.50*/("""</li>
      <li>Logged in from: """),_display_(/*24.28*/user/*24.32*/.providerId),format.raw/*24.43*/("""</li>
      <li>Email: """),_display_(/*25.19*/user/*25.23*/.email.map/*25.33*/ { email =>_display_(Seq[Any](format.raw/*25.44*/(""" """),_display_(/*25.46*/email),format.raw/*25.51*/(""" """)))}/*25.53*/.getOrElse("Not Available")),format.raw/*25.80*/("""</li>
      <li>Authentication method: """),_display_(/*26.35*/user/*26.39*/.authMethod),format.raw/*26.50*/("""</li>
    </ul>

    """),_display_(/*29.6*/user/*29.10*/.oAuth1Info.map/*29.25*/ { info =>_display_(Seq[Any](format.raw/*29.35*/("""
      """),format.raw/*30.7*/("""<h2>OAuth1 Info</h2>

      <ul>
        <li>Token: """),_display_(/*33.21*/info/*33.25*/.token),format.raw/*33.31*/("""</li>
        <li>Secret: """),_display_(/*34.22*/info/*34.26*/.secret),format.raw/*34.33*/("""</li>
      </ul>
    """)))}),format.raw/*36.6*/("""

    """),_display_(/*38.6*/user/*38.10*/.oAuth2Info.map/*38.25*/ { info =>_display_(Seq[Any](format.raw/*38.35*/("""
      """),format.raw/*39.7*/("""<h2>OAuth2 Info</h2>

      <ul>
        <li>Access Token: """),_display_(/*42.28*/info/*42.32*/.accessToken),format.raw/*42.44*/("""</li>
        """),_display_(/*43.10*/info/*43.14*/.tokenType.map/*43.28*/ { t =>_display_(Seq[Any](format.raw/*43.35*/(""" """),format.raw/*43.36*/("""<li>Token Type: """),_display_(/*43.53*/t),format.raw/*43.54*/("""</li> """)))}),format.raw/*43.61*/("""
        """),_display_(/*44.10*/info/*44.14*/.expiresIn.map/*44.28*/ { exp =>_display_(Seq[Any](format.raw/*44.37*/(""" """),format.raw/*44.38*/("""<li>Expires in: """),_display_(/*44.55*/exp),format.raw/*44.58*/(""" """),format.raw/*44.59*/("""seconds</li>""")))}),format.raw/*44.72*/("""
        """),_display_(/*45.10*/info/*45.14*/.refreshToken.map/*45.31*/ { rt =>_display_(Seq[Any](format.raw/*45.39*/(""" """),format.raw/*45.40*/("""<li>Refresh Token: """),_display_(/*45.60*/rt),format.raw/*45.62*/("""</li>""")))}),format.raw/*45.68*/("""
      """),format.raw/*46.7*/("""</ul>
    """)))}),format.raw/*47.6*/("""
    """),format.raw/*48.5*/("""<hr>
    """),_display_(/*49.6*/user/*49.10*/.passwordInfo.map/*49.27*/ { info =>_display_(Seq[Any](format.raw/*49.37*/("""
      """),format.raw/*50.7*/("""<a class="btn" href=""""),_display_(/*50.29*/env/*50.32*/.routes.passwordChangeUrl),format.raw/*50.57*/("""">Change Password</a>
    """)))}),format.raw/*51.6*/("""

    """),format.raw/*53.5*/("""<hr>
    <a class="btn" href=""""),_display_(/*54.27*/securesocial/*54.39*/.controllers.routes.LoginPage.logout()),format.raw/*54.77*/("""">Logout</a>
  </div>
""")))}))}
  }

  def render(user:securesocial.core.BasicProfile,request:RequestHeader,env:securesocial.core.RuntimeEnvironment[services.DemoUser]): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,env)

  def f:((securesocial.core.BasicProfile) => (RequestHeader,securesocial.core.RuntimeEnvironment[services.DemoUser]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,env) => apply(user)(request,env)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 26 10:52:32 GMT 2015
                  SOURCE: /Users/mj/workspace/play24/app/views/index.scala.html
                  HASH: d612ba67f57eb75c9e685be3d39a12632788c890
                  MATRIX: 599->1|1080->134|1107->178|1135->403|1163->405|1216->449|1256->451|1286->454|1358->499|1371->503|1416->527|1451->535|1464->539|1509->563|1577->603|1591->607|1637->631|1761->728|1774->732|1802->739|1857->767|1870->771|1915->795|1970->823|1983->827|2013->836|2069->865|2082->869|2126->892|2186->925|2199->929|2231->940|2282->964|2295->968|2314->978|2363->989|2392->991|2418->996|2439->998|2487->1025|2554->1065|2567->1069|2599->1080|2647->1102|2660->1106|2684->1121|2732->1131|2766->1138|2846->1191|2859->1195|2886->1201|2940->1228|2953->1232|2981->1239|3034->1262|3067->1269|3080->1273|3104->1288|3152->1298|3186->1305|3273->1365|3286->1369|3319->1381|3361->1396|3374->1400|3397->1414|3442->1421|3471->1422|3515->1439|3537->1440|3575->1447|3612->1457|3625->1461|3648->1475|3695->1484|3724->1485|3768->1502|3792->1505|3821->1506|3865->1519|3902->1529|3915->1533|3941->1550|3987->1558|4016->1559|4063->1579|4086->1581|4123->1587|4157->1594|4198->1605|4230->1610|4266->1620|4279->1624|4305->1641|4353->1651|4387->1658|4436->1680|4448->1683|4494->1708|4551->1735|4584->1741|4642->1772|4663->1784|4722->1822
                  LINES: 19->1|28->1|29->3|30->10|31->11|31->11|31->11|32->12|33->13|33->13|33->13|33->13|33->13|33->13|33->13|33->13|33->13|40->20|40->20|40->20|41->21|41->21|41->21|42->22|42->22|42->22|43->23|43->23|43->23|44->24|44->24|44->24|45->25|45->25|45->25|45->25|45->25|45->25|45->25|45->25|46->26|46->26|46->26|49->29|49->29|49->29|49->29|50->30|53->33|53->33|53->33|54->34|54->34|54->34|56->36|58->38|58->38|58->38|58->38|59->39|62->42|62->42|62->42|63->43|63->43|63->43|63->43|63->43|63->43|63->43|63->43|64->44|64->44|64->44|64->44|64->44|64->44|64->44|64->44|64->44|65->45|65->45|65->45|65->45|65->45|65->45|65->45|65->45|66->46|67->47|68->48|69->49|69->49|69->49|69->49|70->50|70->50|70->50|70->50|71->51|73->53|74->54|74->54|74->54
                  -- GENERATED --
              */
          