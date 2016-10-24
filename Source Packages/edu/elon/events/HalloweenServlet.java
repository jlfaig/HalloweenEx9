/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jfaig
 */
@WebServlet(urlPatterns = {"/HalloweenServlet"})
public class HalloweenServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/email.html";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("join")) {
            url = "/email.html";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String zipcode = request.getParameter("zipcode");
            
            System.out.print("First name: " + firstName);
            System.out.print("Last name: " + lastName);
            System.out.print("Email: " + email);
            System.out.print("Zipcode: " + zipcode);
        }
        getServletContext().getRequestDispatcher("/subscribe.html").forward(request, response);
   
    }
}
