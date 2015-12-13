import dispatch._, Defaults._

object RestClient {
  def main(args: Array[String]) {
    val svc = url("http://localhost:8080/hello")
    val request = Http(svc OK as.String)
    val c = request()
    println(c)
  }
}
