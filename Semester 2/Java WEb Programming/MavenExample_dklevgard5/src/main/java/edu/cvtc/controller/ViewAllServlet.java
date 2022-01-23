package edu.cvtc.controller;

import edu.cvtc.comparator.AgeComparator;
import edu.cvtc.comparator.FavoriteColorComparator;
import edu.cvtc.comparator.FirstNameComparator;
import edu.cvtc.comparator.LastNameComparator;
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
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", value = "/ViewAll")
public class ViewAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Set target where we will forward the request to be displayed
        String target = "/view-all.jsp";

//         SEt up file access for the spreadsheet
//        String filePath = getServletContext().getRealPath("assets/JavaWebProgramming.xlsx");
//
//        File inputFile = new File(filePath);

        try {

            // read the spreadsheet to get our data
            //List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);
            PersonDao personDao = new PersonDaoImpl();
            List<Person> people = personDao.retrievePeople();

            //Sort list if necessary
            String sortType = request.getParameter("sortType");

            if (sortType != null && !sortType.isEmpty()){
                // sort our list
                if (sortType.equals("lastName")) {
                    Collections.sort(people, new LastNameComparator());
                } else if (sortType.equals("age")) {
                    Collections.sort(people, new AgeComparator());
                } else if (sortType.equals("firstName")) {
                    Collections.sort(people, new FirstNameComparator());
                } else if (sortType.equals("favoriteColor")) {
                    Collections.sort(people, new FavoriteColorComparator());
                }
            }

            // attach our data to the request
            request.setAttribute("people", people);

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
