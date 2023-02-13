package com.sparta.k_Design_Patterns.Decorator;

public class PepperoniDecorator extends PizzaToppingDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String pepperoniTopping = "Adding pepperoni ";
        return super.prepare() + pepperoniTopping;
    }

    @Override
    public double getPrice() {
        double pepperoniPrice = 1.0;
        return super.getPrice() + pepperoniPrice;
    }
}
