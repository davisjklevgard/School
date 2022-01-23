package com.example.dao;

import java.sql.SQLException;
import java.util.List;
import com.example.model.Movie;

public interface MovieDao {

    public void populate(String filePath) throws MovieDaoException;

    public List<Movie> retrieveMovie() throws MovieDaoException, SQLException;

    public void insertMovie(Movie movie) throws MovieDaoException;
}
