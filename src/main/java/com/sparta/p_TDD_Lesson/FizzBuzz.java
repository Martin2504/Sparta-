package com.sparta.p_TDD_Lesson;

public class FizzBuzz {
    public static String fizzBuzz(int i) {

        if (i%3 == 0 && i%5 == 0){
            return "FizzBuzz";
        } else if (i%3 == 0) {
            return "fizz";
        } else if (i%5 == 0) {
            return "buzz";
        }

        return String.valueOf(i);
    }
}
