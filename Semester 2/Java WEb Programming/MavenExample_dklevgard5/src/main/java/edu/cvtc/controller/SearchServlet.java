package edu.cvtc.controller;

import edu.cvtc.dao.PersonDao;
import edu.cvtc.dao.PersonDaoException;
import edu.cvtc.dao.PersonDaoImpl;
import edu.cvtc.model.Person;
import edu.cvtc.utility.WorkbookUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "SearchServlet", value = "/Search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/view-all.jsp";

//        String filePath = getServletContext().getRealPath("assets/JavaWebProgramming.xlsx");
//        File inputFile = new File(filePath);

        try {

            PersonDao personDao = new PersonDaoImpl();
            List<Person> people = personDao.retrievePeople();


            String searchParameter = request.getParameter("firstName");

            int stringLength = searchParameter.length();


            List<Person> filteredList = people
                                .stream()
                                .filter( (person) -> stringLength < person.getFirstName().length() ? person.getFirstName().substring(0, stringLength).equalsIgnoreCase(searchParameter) : person.getFirstName().equalsIgnoreCase(searchParameter))
                                .collect(Collectors.toList());

            request.setAttribute("people", filteredList);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (PersonDaoException e) {
            e.printStackTrace();
        }


        getServletContext().getRequestDispatcher(target).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
