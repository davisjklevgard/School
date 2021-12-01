package com.example.controller;


import com.example.comparator.LengthComparator;
import com.example.model.Movie;
import com.example.utility.WorkbookUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", value = "/ViewAll")
public class ViewAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Set target where we will forward the request to be displayed
        String target = "/view-all.jsp";

        // SEt up file access for the spreadsheet
        String filePath = getServletContext().getRealPath("assets/MovieList.xlsx");

        File inputFile = new File(filePath);

        try {

            // read the spreadsheet to get our data
            List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);

            //Sort list if necessary
            String sortType = request.getParameter("sortType");

            if (sortType != null && !sortType.isEmpty()){
                // sort our list
                if (sortType.equals("length")) {
                    Collections.sort(movies, new LengthComparator());
                }
            }

            // attach our data to the request
            request.setAttribute("movies", movies);

        } catch (InvalidFormatException e) {
            e.printStackTrace();
            //TODO add error handling
        }

        getServletContext().getRequestDispatcher(target).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
