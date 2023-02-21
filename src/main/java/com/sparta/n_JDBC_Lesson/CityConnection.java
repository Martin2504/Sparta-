package com.sparta.n_JDBC_Lesson;

import java.sql.*;

public class CityConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root",
                    "mynewsql123"
            );
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM sakila.city");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("city" ) + resultSet.getInt("country_id"));
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
