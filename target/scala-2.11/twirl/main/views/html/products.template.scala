
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.HomeController.products(0)),format.raw/*11.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.products(c.getId)),format.raw/*16.70*/("""" class="list-group-item">"""),_display_(/*16.97*/c/*16.98*/.getName),format.raw/*16.106*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*44.12*/for(p <- products) yield /*44.30*/ {_display_(Seq[Any](format.raw/*44.32*/("""
			        """),format.raw/*45.12*/("""<tr>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getId),format.raw/*46.31*/("""</td>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getName),format.raw/*47.33*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getCategory.getName),format.raw/*48.45*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getDescription),format.raw/*49.40*/("""</td>
                  <td>"""),_display_(/*50.24*/p/*50.25*/.getStock),format.raw/*50.34*/("""</td>
                  <td>&euro; """),_display_(/*51.31*/("%.2f".format(p.getPrice))),format.raw/*51.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*55.33*/routes/*55.39*/.HomeController.updateProduct(p.getId)),format.raw/*55.77*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.HomeController.deleteProduct(p.getId)),format.raw/*60.77*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*66.7*/(""" """),format.raw/*66.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*70.21*/routes/*70.27*/.HomeController.addProduct()),format.raw/*70.55*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*79.27*/("""{"""),format.raw/*79.28*/("""
        """),format.raw/*80.9*/("""return confirm('Are you sure?');
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
  """),format.raw/*82.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 12:24:13 GMT 2016
                  SOURCE: /media/sf_student/playlab_crud-part4/app/views/products.scala.html
                  HASH: 6f6ec9faa2a86083450fd0e007f923ce29b14f65
                  MATRIX: 805->1|992->93|1020->95|1080->128|1108->129|1154->148|1182->149|1210->150|1257->172|1287->194|1326->196|1355->199|1621->438|1636->444|1684->471|1935->695|1971->715|2011->717|2060->738|2097->748|2112->754|2166->787|2220->814|2230->815|2260->823|2311->846|2359->867|2369->868|2409->887|2490->937|2531->950|2620->1012|2661->1044|2701->1046|2744->1061|2820->1110|2834->1115|2870->1130|2913->1145|2962->1163|3001->1174|3493->1639|3527->1657|3567->1659|3607->1671|3662->1699|3672->1700|3699->1706|3755->1735|3765->1736|3794->1744|3850->1773|3860->1774|3901->1794|3957->1823|3967->1824|4003->1839|4059->1868|4069->1869|4099->1878|4162->1914|4210->1941|4346->2050|4361->2056|4420->2094|4679->2326|4694->2332|4753->2370|5010->2597|5038->2598|5158->2691|5173->2697|5222->2725|5485->2960|5514->2961|5550->2970|5614->3007|5642->3008|5672->3011
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|86->55|86->55|86->55|91->60|91->60|91->60|97->66|97->66|101->70|101->70|101->70|110->79|110->79|111->80|112->81|112->81|113->82
                  -- GENERATED --
              */
          