/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Jorge-pc
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, 
                         HttpServletResponse resp) throws ServletException, IOException {
        String nameParam = req.getParameter("GameStore");
        String name = nameParam != null ? nameParam : "GameStore";
        resp.getWriter().print("A nossa loja é " + name + "!");
    }
}
