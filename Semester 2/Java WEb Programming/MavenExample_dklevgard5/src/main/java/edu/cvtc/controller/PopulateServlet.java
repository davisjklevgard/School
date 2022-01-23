package edu.cvtc.controller;

import edu.cvtc.dao.PersonDao;
import edu.cvtc.dao.PersonDaoException;
import edu.cvtc.dao.PersonDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PopulateServlet", value = "/Populate")
public class PopulateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String filePath = getServletContext().getRealPath("assets/JavaWebProgramming.xlsx");

        PersonDao personDao = new PersonDaoImpl();

        String message = "";

        try {
            personDao.populate(filePath);
            message = "The database has been populated";
        } catch (PersonDaoException e) {
            e.printStackTrace();
            message = "An error occurred, the database was not populated";
        }

        request.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/populate.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
