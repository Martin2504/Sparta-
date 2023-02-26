package com.sparta.n_JDBC_Lesson.mySql;

import com.sparta.n_JDBC_Lesson.ConnectionFactory;
import com.sparta.n_JDBC_Lesson.entities.Actor;
import com.sparta.n_JDBC_Lesson.interfaces.DAO;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO implements DAO<Actor> {

    public static void usePreparedStatementsToRead() {  // protect against SQL injection attacks
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            // Establish connection
            Connection connection = ConnectionFactory.getConnection();
            // Prepare a statement to be called
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM actor WHERE last_name = ?"   );
            // Call the prepared statement, populating the 1st wildcard (index 1)
            // with the name "HURT".
            preparedStatement.setString(1, "HURT");
            // Assign a query to a ResultSet
            rs = preparedStatement.executeQuery();
            // Read the data using next() method
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString("first_name") + " " +
                        rs.getString(3));
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // Close the connection to save resources
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void useStatementToRead() {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updates(Actor update) {

    }

    @Override
    public int insert(Actor newRow) {       // use prepared statement for this
        return 0;
    }

    @Override
    public Actor findById(int id) {
        return null;
    }

    @Override
    public List<Actor> findAll() {
        // Declare out here so that they can be used by
        // other methods outside the try{} block.
        Statement statement = null;
        ResultSet resultSet = null;
        List<Actor> list = new ArrayList<>();
        try {
            // Call connectionFactory
            Connection connection = ConnectionFactory.getConnection();
            // Create a statement object
            statement = connection.createStatement();
            // Assign a query to a ResultSet
            resultSet = statement.executeQuery("SELECT * FROM sakila.actor");

            /*
            TASK:   Below, use resultSet to create actor objects then add
            to an appropriate list. Then return the list.
             */

            // Read the data using next() method
            while (resultSet.next()) {
                list.add(new Actor(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4)));
            }
        } catch (SQLException |IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // Close the connection to save resources
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
}
