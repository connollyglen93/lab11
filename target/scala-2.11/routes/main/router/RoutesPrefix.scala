
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/playlab_crud-part4/conf/routes
// @DATE:Tue Dec 06 11:55:36 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
