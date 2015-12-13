import org.scalatra._

class RestService extends ScalatraServlet {
  get("/") {
    "hello"
  }
}

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{ServletHolder, ServletContextHandler}

object JettyApp {
  def main(args: Array[String]) {
    val server = new Server(8080)
    val context = new ServletContextHandler()
    context.setContextPath("/")
    server.setHandler(context)

    val holder = new ServletHolder(classOf[RestService])
    context.addServlet(holder, "/hello")

    server.start()
    server.join()
  }
}

