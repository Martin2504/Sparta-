package com.sparta.n_JDBC_Lesson;

import java.io.IOException;
import java.sql.*;

public class CityConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Call connectionFactory
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM sakila.city");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("city" ) + resultSet.getInt("country_id"));
            }

        } catch (SQLException | IOException e) {
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
