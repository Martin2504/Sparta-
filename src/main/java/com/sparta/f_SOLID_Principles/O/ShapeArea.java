package com.sparta.f_SOLID_Principles.O;

// This is the bad example which Violates the Open-Closed principle.
// Others could have to come here and modify the code to add new shapes.
// Instead, implementing from the Shape interface is wanted.

public class ShapeArea {
    public static double areaCalcRectangle(Rectangle r) {
        return r.getLength() * r.getWidth();
    }

    public double areaCalcCircle(Circle c) {
        return Math.PI * c.getRadius() * c.getRadius();
    }




}
