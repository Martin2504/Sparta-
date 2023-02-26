package com.sparta.n_JDBC_Lesson.mySql;

import com.sparta.n_JDBC_Lesson.ConnectionFactory;
import com.sparta.n_JDBC_Lesson.interfaces.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AddressDAO implements DAO {

    public static void usePreparedStatementToRead() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM address WHERE district = ?"  );
            preparedStatement.setString(1, "California");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("address_id")+ " || ");
                System.out.print(resultSet.getString("address")+ " || ");
                System.out.println(resultSet.getInt("city_id") + " || ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updates(Object update) {

    }

    @Override
    public int insert(Object newRow) {
        return 0;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
