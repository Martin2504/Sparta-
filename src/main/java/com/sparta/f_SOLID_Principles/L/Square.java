package com.sparta.f_SOLID_Principles.L;
import com.sparta.f_SOLID_Principles.O.Rectangle;

// Any rectangle can be replaced by a square.

public class Square extends Rectangle{
    private double length;

    public Square(double length) {
        super(length, length);              // makes both length and width length
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
