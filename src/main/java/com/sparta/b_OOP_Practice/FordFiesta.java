package com.sparta.b_OOP_Practice;

public class FordFiesta extends Car {

    public FordFiesta(int numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    // Override method
    @Override
    public void honk() {
        System.out.println("Fiesta specific quiet, pathetic honk");
    }


}
