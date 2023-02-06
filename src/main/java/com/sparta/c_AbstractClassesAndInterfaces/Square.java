package com.sparta.c_AbstractClassesAndInterfaces;

public class Square extends Shape{
     private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return width * width;
    }
}
