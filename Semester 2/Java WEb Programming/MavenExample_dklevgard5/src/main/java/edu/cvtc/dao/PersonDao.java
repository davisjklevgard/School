package edu.cvtc.dao;

import edu.cvtc.model.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonDao {

    public void populate(String filePath) throws PersonDaoException;

    public List<Person> retrievePeople() throws PersonDaoException, SQLException;

    public void insertPerson(Person person) throws PersonDaoException;
}
