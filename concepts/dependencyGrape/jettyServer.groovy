@Grapes([
        @Grab(group='org.eclipse.jetty.aggregate', module='jetty-server', version='8.1.7.v20120910'),
        @Grab(group='org.eclipse.jetty.aggregate', module='jetty-servlet', version='8.1.7.v20120910'),
        @Grab(group='javax.servlet', module='javax.servlet-api', version='3.0.1')])

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*

def runServer(duration) {
    def server = new Server(8080)
    def context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
    context.resourceBase = "."
    context.addServlet(TemplateServlet, "*.gsp")
    server.start()
    sleep duration
    server.stop()
}

runServer(10000)