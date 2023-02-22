package com.sparta.n_JDBC_Lesson;

import com.sparta.n_JDBC_Lesson.mySql.ActorDAO;

public class ActorCreator {
    public static void create() {
        ActorDAO actorDAO = new ActorDAO();
        actorDAO.findAll();
    }
}
