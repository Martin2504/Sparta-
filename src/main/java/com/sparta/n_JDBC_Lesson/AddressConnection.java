package com.sparta.n_JDBC_Lesson;

import java.sql.*;

public class AddressConnection {
    public static void address() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Create the connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root",
                    "mynewsql123"
            );

            // Create the statement which will act like a holder for the query
            statement = connection.createStatement();

            // Populate the result set with the data
            resultSet = statement.executeQuery("SELECT * FROM sakila.address");

            // print the data
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("city_id"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
