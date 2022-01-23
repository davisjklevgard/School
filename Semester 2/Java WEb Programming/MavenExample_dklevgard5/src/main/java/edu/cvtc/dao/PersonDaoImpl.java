package edu.cvtc.dao;

import edu.cvtc.model.Person;
import edu.cvtc.utility.DBUtility;
import edu.cvtc.utility.WorkbookUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao{

    private final String DROP_TABLE_PERSON = "drop table if exists person;";
    private final String CREATE_TABLE_PERSON = "create table person (id integer primary key autoincrement, firstName text, lastName text, age integer, favoriteColor text);";
    private final String SELECT_ALL_FROM_PERSON = "select * from person;";


    @Override
    public void populate(String filePath) throws PersonDaoException {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtility.createConnection();
            statement = connection.createStatement();

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate(DROP_TABLE_PERSON);
            statement.executeUpdate(CREATE_TABLE_PERSON);

            File inputFile = new File(filePath);
            List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            for(Person person: people) {
                String insertValues = "INSERT INTO person (firstName, lastName, age, favoriteColor) " +
                        "VALUES ('" + person.getFirstName() + "', '"
                        + person.getLastName() + "', "
                        + person.getAge() + ", '"
                        + person.getFavoriteColor() + "');";

                System.out.println(insertValues); // NOTES Log the sql that we are sending

                statement.executeUpdate(insertValues);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new PersonDaoException("Driver class error occurred");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            throw new PersonDaoException("SQL Problem error occurred");
        } catch (IOException e) {
            e.printStackTrace();
            throw new PersonDaoException("error occurred");
        } catch (InvalidFormatException e) {
            e.printStackTrace();
            throw new PersonDaoException("error occurred");
        }
    }

    @Override
    public List<Person> retrievePeople() throws PersonDaoException{
        List<Person> people = new ArrayList<Person>();

        Connection connection = null;
        Statement statement = null;

        try {

            connection = DBUtility.createConnection();
            statement = connection.createStatement();

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            ResultSet results = statement.executeQuery(SELECT_ALL_FROM_PERSON);

            while (results.next()) {
                String firstName = results.getString("firstName");
                String lastName = results.getString("lastName");
                int age = results.getInt("age");
                String favoriteColor = results.getString("favoriteColor");

//                Person person = new Person(firstName, lastName, age, favoriteColor);
//                people.add(person);
                people.add(new Person(firstName, lastName, age, favoriteColor));
            }


        } catch (SQLException e) {
            e.printStackTrace();
            throw new PersonDaoException(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new PersonDaoException(e.getMessage());
        }

        return people;
    }

    @Override
    public void insertPerson(Person person) throws PersonDaoException {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DBUtility.createConnection();

            String insertSql = "INSERT INTO person (firstName, lastName, age, favoriteColor) VALUES (?,?,?,?);";

            statement = connection.prepareStatement(insertSql);

            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getLastName());
            statement.setInt(3, person.getAge());
            statement.setString(4, person.getFavoriteColor());

            statement.setQueryTimeout(DBUtility.TIMEOUT);
            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new PersonDaoException(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new PersonDaoException(e.getMessage());
        } finally {
            try {
                DBUtility.closeConnection(connection, statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
