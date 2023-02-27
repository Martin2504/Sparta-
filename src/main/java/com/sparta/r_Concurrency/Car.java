package com.sparta.r_Concurrency;

public class Car {

    // Synchronized demonstration
    public static synchronized void method() {
        System.out.println("I am running this method");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am done");
    }
}
