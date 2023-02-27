package com.sparta.r_Concurrency;

public class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello this is the MyRunnableThread");

        // Synchronized demonstration
//        Car.method();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("My runnable is now finished");
    }


}
