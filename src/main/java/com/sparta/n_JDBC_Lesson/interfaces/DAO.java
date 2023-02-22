package com.sparta.n_JDBC_Lesson.interfaces;
import java.util.List;

public interface DAO <T> {
    void deleteById(int id);
    void updates(T update);
    int insert(T newRow);
    T findById(int id);
    List<T> findAll();

}
