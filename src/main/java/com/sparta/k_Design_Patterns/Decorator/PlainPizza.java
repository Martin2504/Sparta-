package com.sparta.k_Design_Patterns.Decorator;

public class PlainPizza implements Pizza{
    public String prepare() {
        // say this applies to every pizza we sell at the restaurant
        return "Preparing signature thin dough ";
    }

    public double getPrice() {
        // base price before any toppings are added
        return 4.0;
    }
}
