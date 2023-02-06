package com.sparta.b_OOP_Practice;

public class Car {
    private int numberOfWheels;
    private String color;
    private boolean carVAT = true;

    public boolean isCarVAT() {
        return carVAT;
    }

    public void setCarVAT(boolean carVAT) {
        this.carVAT = carVAT;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // This is where we would call a method to order a painter tto paint the car for example.
        this.color = color;
    }

    public Car(int numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public void honk() {
        System.out.println("This car honks");
    }

}
