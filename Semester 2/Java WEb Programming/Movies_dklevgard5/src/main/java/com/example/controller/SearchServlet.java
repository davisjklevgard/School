package com.example.controller;

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
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "SearchServlet", value = "/Search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/view-all.jsp";

        String filePath = getServletContext().getRealPath("assets/MovieList.xlsx");

        File inputFile = new File(filePath);

        try {
            List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);


            String searchParameter = request.getParameter("title");

            int stringLength = searchParameter.length();


            List<Movie> filteredList = movies
                                .stream()
                                .filter( (movie) -> stringLength < movie.getTitle().length() ? movie.getTitle().substring(0, stringLength).equalsIgnoreCase(searchParameter) : movie.getTitle().equalsIgnoreCase(searchParameter))
                                .collect(Collectors.toList());

            request.setAttribute("movies", filteredList);

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        
        


        getServletContext().getRequestDispatcher(target).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
