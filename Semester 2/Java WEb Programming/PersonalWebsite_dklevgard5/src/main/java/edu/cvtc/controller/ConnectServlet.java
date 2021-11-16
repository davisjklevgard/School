package edu.cvtc.controller;

import edu.cvtc.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConnectServlet", value = "/connect")
public class ConnectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // cause a null pointer to test the error page
//        String someVariable = null;
//
//        someVariable.toUpperCase();
        //Cause an exception
        //File someFile = new File("thewrongpath");
        //FileInputStream in = new FileInputStream(someFile);


        String target = "/thanks.jsp";

        //get user's first name
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");


        if(null != firstName && !firstName.isEmpty() &&
                null != lastName && !lastName.isEmpty() &&
                null != email && !email.isEmpty()) {
            //User did submit data
            User connectUser = new User(firstName, lastName, email);
            request.setAttribute("name", firstName);
            //TODO send  the model object to the database dor storage
        } else {
            // user did not submit data
            target = "/contact.jsp";
            request.setAttribute("message", "Please fill out all the fields." );
        }



        getServletContext().getRequestDispatcher(target).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
