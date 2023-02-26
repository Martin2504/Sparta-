package com.sparta.n_JDBC_Lesson;

import com.sparta.n_JDBC_Lesson.entities.Actor;
import com.sparta.n_JDBC_Lesson.mySql.ActorDAO;

public class ActorCreator {
    public static void create() {
        ActorDAO actorDAO = new ActorDAO();
//        actorDAO.usePreparedStatementsToRead();   // returns a certain actor

        for (Actor a : actorDAO.findAll()) {        // returns all actors
            System.out.println(a.toString());
        }
    }
}
