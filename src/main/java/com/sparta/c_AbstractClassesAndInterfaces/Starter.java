package com.sparta.c_AbstractClassesAndInterfaces;

public class Starter {
    public static void start() {

        Shape newCircle = new Circle(4);
        System.out.println("newCircle's area is " + newCircle.calcArea());

        Shape newSquare = new Square(10);
        System.out.println("newSquare's area is " + newSquare.calcArea());


        Goose goose = new Goose();
        goose.fly();


    }
}
