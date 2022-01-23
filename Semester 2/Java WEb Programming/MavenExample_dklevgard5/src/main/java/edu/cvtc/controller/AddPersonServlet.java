package edu.cvtc.controller;

import edu.cvtc.dao.PersonDao;
import edu.cvtc.dao.PersonDaoException;
import edu.cvtc.dao.PersonDaoImpl;
import edu.cvtc.model.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddPersonServlet", value = "/AddPerson")
public class AddPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/add-person.jsp";

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int age = Integer.parseInt(request.getParameter("age"));
        String favoriteColor = request.getParameter("favoriteColor");

        String message = "";
        String style = "red";

        if(!firstName.isEmpty() || !lastName.isEmpty() || age > 0 || !favoriteColor.isEmpty()) {
            // user submitted all the necessary data
            PersonDao personDao = new PersonDaoImpl();

            try {
                personDao.insertPerson(new Person(firstName, lastName, age, favoriteColor));
                message = "person has been added to the database";
                style = "green";
            } catch (PersonDaoException e) {
                e.printStackTrace();
                message = "There was an error, person was not added";
            }

        } else {
            // data is missing
            message = "person was not added, please check your data";
        }

        request.setAttribute("message", message);
        request.setAttribute("style", style);

        getServletContext().getRequestDispatcher(target).forward(request, response);
    }
}
