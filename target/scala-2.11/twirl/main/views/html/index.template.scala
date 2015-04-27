
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[securesocial.core.BasicProfile,RequestHeader,securesocial.core.RuntimeEnvironment[models.DemoUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: securesocial.core.BasicProfile)(implicit request: RequestHeader, env: securesocial.core.RuntimeEnvironment[models.DemoUser]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import securesocial.core.IdentityProvider
import securesocial.core.IdentityProvider
import securesocial.core.providers.UsernamePasswordProvider
import securesocial.core.AuthenticationMethod._
import play.api.{Logger, Play}
import helper._
import play.api.Play

Seq[Any](format.raw/*1.133*/("""
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

  def render(user:securesocial.core.BasicProfile,request:RequestHeader,env:securesocial.core.RuntimeEnvironment[models.DemoUser]): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,env)

  def f:((securesocial.core.BasicProfile) => (RequestHeader,securesocial.core.RuntimeEnvironment[models.DemoUser]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,env) => apply(user)(request,env)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 27 14:00:34 GMT 2015
                  SOURCE: /Users/mj/workspace/play-oauth2/app/views/index.scala.html
                  HASH: d3f03b7de6645eee89cd907f8f0153d72f886793
                  MATRIX: 597->1|1076->132|1103->176|1131->401|1159->403|1212->447|1252->449|1282->452|1354->497|1367->501|1412->525|1447->533|1460->537|1505->561|1573->601|1587->605|1633->629|1757->726|1770->730|1798->737|1853->765|1866->769|1911->793|1966->821|1979->825|2009->834|2065->863|2078->867|2122->890|2182->923|2195->927|2227->938|2278->962|2291->966|2310->976|2359->987|2388->989|2414->994|2435->996|2483->1023|2550->1063|2563->1067|2595->1078|2643->1100|2656->1104|2680->1119|2728->1129|2762->1136|2842->1189|2855->1193|2882->1199|2936->1226|2949->1230|2977->1237|3030->1260|3063->1267|3076->1271|3100->1286|3148->1296|3182->1303|3269->1363|3282->1367|3315->1379|3357->1394|3370->1398|3393->1412|3438->1419|3467->1420|3511->1437|3533->1438|3571->1445|3608->1455|3621->1459|3644->1473|3691->1482|3720->1483|3764->1500|3788->1503|3817->1504|3861->1517|3898->1527|3911->1531|3937->1548|3983->1556|4012->1557|4059->1577|4082->1579|4119->1585|4153->1592|4194->1603|4226->1608|4262->1618|4275->1622|4301->1639|4349->1649|4383->1656|4432->1678|4444->1681|4490->1706|4547->1733|4580->1739|4638->1770|4659->1782|4718->1820
                  LINES: 19->1|28->1|29->3|30->10|31->11|31->11|31->11|32->12|33->13|33->13|33->13|33->13|33->13|33->13|33->13|33->13|33->13|40->20|40->20|40->20|41->21|41->21|41->21|42->22|42->22|42->22|43->23|43->23|43->23|44->24|44->24|44->24|45->25|45->25|45->25|45->25|45->25|45->25|45->25|45->25|46->26|46->26|46->26|49->29|49->29|49->29|49->29|50->30|53->33|53->33|53->33|54->34|54->34|54->34|56->36|58->38|58->38|58->38|58->38|59->39|62->42|62->42|62->42|63->43|63->43|63->43|63->43|63->43|63->43|63->43|63->43|64->44|64->44|64->44|64->44|64->44|64->44|64->44|64->44|64->44|65->45|65->45|65->45|65->45|65->45|65->45|65->45|65->45|66->46|67->47|68->48|69->49|69->49|69->49|69->49|70->50|70->50|70->50|70->50|71->51|73->53|74->54|74->54|74->54
                  -- GENERATED --
              */
          