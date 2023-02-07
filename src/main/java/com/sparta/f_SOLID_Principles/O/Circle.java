package com.sparta.f_SOLID_Principles.O;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalc() {
        return Math.PI * getRadius() * getRadius();
    }
}
