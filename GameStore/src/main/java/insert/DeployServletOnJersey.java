/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import sv.Servlet;

/**
 *
 * @author Jorge-pc
 */
public class DeployServletOnJersey {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8090);
 
        ServletContextHandler ctx = new ServletContextHandler();
        ctx.setContextPath("/");
        ctx.addServlet(Servlet.class, "/hello");
        server.setHandler(ctx);
 
        server.start();
        server.join();
    }
    
}
