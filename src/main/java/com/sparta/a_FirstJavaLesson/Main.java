package com.sparta.FirstJavaLesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ask();

    }

    public static void ask() {

        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please enter a time of day: ");
        int timeOfDay = scanner.nextInt();
        System.out.println(greeting(timeOfDay));

    }

    public static String greeting(int timeOfDay) {
        String greeting = null;
        if (timeOfDay < 0 || timeOfDay > 24) {
            System.out.println("You must enter a integer between 0 and 24...");
        } else if(timeOfDay <= 12) {
                greeting = "Good Morning!";
        } else if (timeOfDay <= 18) {
                greeting = "Good Afternoon!";
        } else {
                greeting = "Good Evening!";
        }

        return greeting;
    }

}