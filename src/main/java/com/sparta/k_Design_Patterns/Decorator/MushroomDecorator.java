package com.sparta.k_Design_Patterns.Decorator;

public class MushroomDecorator extends PizzaToppingDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        return super.prepare() + "Adding Mushrooms ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}
