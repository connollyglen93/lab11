
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Home", user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>Homepage</h4>
        </div>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*14.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 12:03:59 GMT 2016
                  SOURCE: /media/sf_student/playlab_crud-part4/app/views/index.scala.html
                  HASH: c0d1ddd216a2f9945b3a400ac5baa31c411a1d7d
                  MATRIX: 756->1|876->26|904->28|964->61|992->62|1038->81|1066->82|1094->83|1141->105|1167->123|1206->125|1235->128|1484->347
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|45->14
                  -- GENERATED --
              */
          