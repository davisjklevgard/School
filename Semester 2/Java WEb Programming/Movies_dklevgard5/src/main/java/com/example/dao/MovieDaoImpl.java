package com.example.dao;

import com.example.utility.DBUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.example.model.Movie;
import com.example.utility.WorkbookUtility;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao{

    private final String DROP_TABLE_Movie = "drop table if exists Movie;";
    private final String CREATE_TABLE_Movie = "create table Movie (id integer primary key autoincrement, title text, director text, lengthInMinutes integer);";
    private final String SELECT_ALL_FROM_Movie = "select * from Movie;";


    @Override
    public void populate(String filePath) throws MovieDaoException {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtility.createConnection();
            statement = connection.createStatement();

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate(DROP_TABLE_Movie);
            statement.executeUpdate(CREATE_TABLE_Movie);

            File inputFile = new File(filePath);
            List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);

            for(Movie movie: movies) {
                String insertValues = "INSERT INTO Movie (title, director, lengthInMinutes, favoriteColor) " +
                        "VALUES ('" + movie.getTitle() + "', '"
                        + movie.getDirector() + "', "
                        + movie.getLengthInMinutes() + ", ";

                System.out.println(insertValues); // NOTES Log the sql that we are sending

                statement.executeUpdate(insertValues);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new MovieDaoException("Driver class error occurred");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            throw new MovieDaoException("SQL Problem error occurred");
        } catch (IOException e) {
            e.printStackTrace();
            throw new MovieDaoException("error occurred");
        } catch (InvalidFormatException e) {
            e.printStackTrace();
            throw new MovieDaoException("error occurred");
        }
    }

    @Override
    public List<Movie> retrieveMovie() throws MovieDaoException{
        List<Movie> movies = new ArrayList<Movie>();

        Connection connection = null;
        Statement statement = null;

        try {

            connection = DBUtility.createConnection();
            statement = connection.createStatement();

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            ResultSet results = statement.executeQuery(SELECT_ALL_FROM_Movie);

            while (results.next()) {
                String title = results.getString("title");
                String director = results.getString("director");
                int lengthInMinutes = results.getInt("lengthInMinutes");

                movies.add(new Movie(title, director, lengthInMinutes));
            }


        } catch (SQLException e) {
            e.printStackTrace();
            throw new MovieDaoException(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new MovieDaoException(e.getMessage());
        }

        return movies;
    }

    @Override
    public void insertMovie(Movie movie) throws MovieDaoException {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DBUtility.createConnection();

            String insertSql = "INSERT INTO movie (title, director, lengthInMinutes) VALUES (?,?,?);";

            statement = connection.prepareStatement(insertSql);

            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getDirector());
            statement.setInt(3, movie.getLengthInMinutes());

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new MovieDaoException(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MovieDaoException(e.getMessage());
        } finally {
            try {
                DBUtility.closeConnection(connection, statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
