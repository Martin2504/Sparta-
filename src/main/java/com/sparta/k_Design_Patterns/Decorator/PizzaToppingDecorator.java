package com.sparta.k_Design_Patterns.Decorator;

public abstract class PizzaToppingDecorator implements Pizza {

    protected Pizza pizza;  // this is the pizza i will decorate

    public PizzaToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String prepare() {
        return pizza.prepare();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
