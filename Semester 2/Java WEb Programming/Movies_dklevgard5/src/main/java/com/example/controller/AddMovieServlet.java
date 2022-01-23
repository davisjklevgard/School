package com.example.controller;

import com.example.dao.MovieDao;
import com.example.dao.MovieDaoException;
import com.example.dao.MovieDaoImpl;
import com.example.model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddMovieServlet", value = "/AddMovie")
public class AddMovieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/addMovie.jsp";

        String title = request.getParameter("title");
        String director = request.getParameter("director");
        int lengthInMinutes = Integer.parseInt(request.getParameter("lengthInMinutes"));

        String message = "";
        String style = "red";

        if(!title.isEmpty() || !director.isEmpty() || lengthInMinutes > 0) {
            // user submitted all the necessary data
            MovieDao movieDao = new MovieDaoImpl();

            try {
                movieDao.insertMovie(new Movie(title, director, lengthInMinutes));
                message = "Movie has been added to the database";
                style = "green";
            } catch (MovieDaoException e) {
                e.printStackTrace();
                message = "There was an error, Movie was not added";
            }

        } else {
            // data is missing
            message = "Movie was not added, please check your data";
        }

        request.setAttribute("message", message);
        request.setAttribute("style", style);

        getServletContext().getRequestDispatcher(target).forward(request, response);
    }
}
