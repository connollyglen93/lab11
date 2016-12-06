
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
  """),format.raw/*5.3*/("""<div class="col-xs-4">
    <h3>Sign in</h3>
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
          """),_display_(/*9.12*/loginForm/*9.21*/.globalError.message),format.raw/*9.41*/("""
        """),format.raw/*10.9*/("""</p>
    """)))}),format.raw/*11.6*/("""
    """),_display_(/*12.6*/if(flash.containsKey("error"))/*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
      """),format.raw/*13.7*/("""<div class="alert alert-warning">
      """),_display_(/*14.8*/flash/*14.13*/.get("loginRequired")),format.raw/*14.34*/("""
      """),format.raw/*15.7*/("""</div>
    """)))}),format.raw/*16.6*/("""

    """),_display_(/*18.6*/helper/*18.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*18.76*/ {_display_(Seq[Any](format.raw/*18.78*/("""
      """),format.raw/*19.7*/("""<div class="form-group">
        """),_display_(/*20.10*/inputText(loginForm("email"), '_label -> " ",
        'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*21.68*/("""
      """),format.raw/*22.7*/("""</div>
      <div class="form-group">
        """),_display_(/*24.10*/inputText(loginForm("password"), '_label -> " ",
        'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*25.71*/("""
      """),format.raw/*26.7*/("""</div>
      <div class="form-group">
          <input type="submit" value="Sign In" class="btn btn-primary">
      </div>
    """)))}),format.raw/*30.6*/("""
  """),format.raw/*31.3*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 12:17:12 GMT 2016
                  SOURCE: /media/sf_student/playlab_crud-part4/app/views/login.scala.html
                  HASH: 7d915d6f7e6feb5dd4b3df2236b3cc39f85be8b5
                  MATRIX: 781->1|953->63|980->81|1007->83|1034->102|1073->104|1102->107|1176->156|1213->185|1252->187|1287->196|1356->239|1373->248|1413->268|1449->277|1489->287|1521->293|1560->323|1600->325|1634->332|1701->373|1715->378|1757->399|1791->406|1833->418|1866->425|1881->431|1954->495|1994->497|2028->504|2089->538|2223->651|2257->658|2331->705|2471->824|2505->831|2663->959|2693->962
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|37->7|37->7|37->7|38->8|39->9|39->9|39->9|40->10|41->11|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|48->18|48->18|48->18|48->18|49->19|50->20|51->21|52->22|54->24|55->25|56->26|60->30|61->31
                  -- GENERATED --
              */
          