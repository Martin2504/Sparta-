package com.sparta.n_JDBC_Lesson;

import java.sql.*;

public class ActorConnection {
    public static void actor() {
        // Declare out here so that they can be used by
        // other methods outside the try{} block.
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Create a connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root",
                    "mynewsql123"
            );

            // Create a statement object
            statement = connection.createStatement();
            // Assign a query to a ResultSet
            resultSet = statement.executeQuery("SELECT * FROM sakila.actor");
            // Read the data using next() method
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)); // SQL columns indexed from 1
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // Close the connection to save resources
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
