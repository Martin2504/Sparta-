package com.sparta.p_TDD_Lesson;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        int max = 50;
        for (int i = 1; i<=50; i++) {
            logger.log(Level.INFO, FizzBuzz.fizzBuzz(i));
        }
    }
}
