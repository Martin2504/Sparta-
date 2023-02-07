package com.sparta.f_SOLID_Principles.O;

public class Rectangle implements Shape {
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double areaCalc() {
        return getWidth() * getLength();
    }
}
