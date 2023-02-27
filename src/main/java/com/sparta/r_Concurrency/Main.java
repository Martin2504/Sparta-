package com.sparta.r_Concurrency;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();


        Thread myRunnableThread = new Thread(new MyRunnableThread());
        myRunnableThread.start();

        // Synchronized demonstration
//        Thread myNewRunnableThread = new Thread(new MyRunnableThread());
//        myNewRunnableThread.start();


        try {
            myRunnableThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main done");



    }
}
