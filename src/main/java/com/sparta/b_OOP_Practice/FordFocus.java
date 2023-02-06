package com.sparta.b_OOP_Practice;

public class FordFocus extends Car{

    public FordFocus(int numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    @Override
    public void honk() {
        System.out.println("Focus big, booming honk");
    }




}
