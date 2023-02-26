package com.sparta.n_JDBC_Lesson;

import com.sparta.n_JDBC_Lesson.mySql.AddressDAO;


public class AddressCreator {
    public static void create() {
        AddressDAO addressDAO = new AddressDAO();
        addressDAO.usePreparedStatementToRead();
    }

}
