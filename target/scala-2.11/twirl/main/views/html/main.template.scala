
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.at("lib/bootstrap/css/bootstrap.min.css")),format.raw/*8.105*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("images/favicon.png")),format.raw/*9.93*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
  </head>
  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <span class="brand" >SecureSocial 2 Scala Sample</span>
        </div>
      </div>
    </div>

    <div class="container" style="padding-top:30px">
      """),_display_(/*22.8*/content),format.raw/*22.15*/("""
    """),format.raw/*23.5*/("""</div>
  </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 27 10:48:11 GMT 2015
                  SOURCE: /Users/mj/workspace/play-oauth2/app/views/main.scala.html
                  HASH: 4946afd437097635a3897d44863ccc65e73df829
                  MATRIX: 509->1|627->31|655->33|726->78|751->83|835->141|849->147|919->196|1002->253|1016->259|1068->291|1116->312|1131->318|1190->356|1543->683|1571->690|1603->695
                  LINES: 19->1|22->1|24->3|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|43->22|43->22|44->23
                  -- GENERATED --
              */
          