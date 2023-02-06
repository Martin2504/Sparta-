package com.sparta.b_OOP_Practice;

public class OOP_Practice_Main {


    public static void main(String[] args) {

        // Instantiation
        Car redCar = new Car(4, "red");

//        redCar.honk();
//        System.out.println(redCar.color);

        FordFiesta blueFiesta = new FordFiesta(4, "blue");
        FordFocus greenFocus = new FordFocus(4, "green");


        Car[] carArray = {redCar, blueFiesta, greenFocus};

        for (Car c : carArray) {         // for each loop
            c.honk();
        }
        System.out.println();


        System.out.println(redCar.getColor());
        redCar.setColor("orange");
        System.out.println(redCar.getColor());


    }


}