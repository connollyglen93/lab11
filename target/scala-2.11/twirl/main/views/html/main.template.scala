
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*28.22*/if(title == "Home")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">Home</a></li>
                <li """),_display_(/*29.22*/if(title == "About")/*29.42*/{_display_(Seq[Any](format.raw/*29.43*/("""class="active"""")))}),format.raw/*29.58*/("""><a href=""""),_display_(/*29.69*/routes/*29.75*/.HomeController.about()),format.raw/*29.98*/("""">About Us</a></li>
                <li """),_display_(/*30.22*/if(title == "Products")/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/("""><a href=""""),_display_(/*30.72*/routes/*30.78*/.HomeController.products()),format.raw/*30.104*/("""">Products</a></li>
                <!-- Login Link -->
                <li """),_display_(/*32.22*/if(title == "Login")/*32.42*/{_display_(Seq[Any](format.raw/*32.43*/("""class="active"""")))}),format.raw/*32.58*/(""">
                    """),_display_(/*33.22*/if(user != null)/*33.38*/ {_display_(Seq[Any](format.raw/*33.40*/("""
                        """),format.raw/*34.25*/("""<a href=""""),_display_(/*34.35*/routes/*34.41*/.LoginController.logout()),format.raw/*34.66*/("""">Logout</a>
                    """)))}/*35.23*/else/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
                        """),format.raw/*36.25*/("""<a href=""""),_display_(/*36.35*/routes/*36.41*/.LoginController.login()),format.raw/*36.65*/("""">Login</a>
                    """)))}),format.raw/*37.22*/("""
                """),format.raw/*38.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*44.32*/("""
        """),_display_(/*45.10*/content),format.raw/*45.17*/("""
    """),format.raw/*46.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*55.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 12:05:02 GMT 2016
                  SOURCE: /media/sf_student/playlab_crud-part4/app/views/main.scala.html
                  HASH: f323de2d2032f4303e5a79e759487fa44c70eaac
                  MATRIX: 1020->260|1170->315|1198->317|1278->422|1314->431|1349->439|1375->444|1650->692|1665->698|1728->739|1816->800|1831->806|1892->845|2299->1225|2327->1244|2366->1245|2412->1260|2450->1271|2465->1277|2509->1300|2573->1337|2602->1357|2641->1358|2687->1373|2725->1384|2740->1390|2784->1413|2852->1454|2884->1477|2923->1478|2969->1493|3007->1504|3022->1510|3070->1536|3174->1613|3203->1633|3242->1634|3288->1649|3338->1672|3363->1688|3403->1690|3456->1715|3493->1725|3508->1731|3554->1756|3607->1791|3620->1796|3659->1797|3712->1822|3749->1832|3764->1838|3809->1862|3873->1895|3918->1912|4028->2084|4065->2094|4093->2101|4125->2106|4487->2441|4502->2447|4564->2488
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|58->28|58->28|58->28|58->28|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|60->30|60->30|60->30|60->30|62->32|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|66->36|67->37|68->38|73->44|74->45|74->45|75->46|84->55|84->55|84->55
                  -- GENERATED --
              */
          