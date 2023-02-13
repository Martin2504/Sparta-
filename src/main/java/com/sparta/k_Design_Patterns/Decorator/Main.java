package com.sparta.k_Design_Patterns.Decorator;

public class Main {
    public static void main(String[] args) {
//        PlainPizza mushroomPepperoniPizza = new MushroomPepperoniPizza();
//        System.out.println(mushroomPepperoniPizza.prepare());
//        System.out.println(mushroomPepperoniPizza.getPrice());

        // Decorating the pizza
        Pizza pizzaCustomer1 = new MushroomDecorator(new PepperoniDecorator(new PlainPizza()));
        System.out.println(pizzaCustomer1.prepare());
        System.out.println(pizzaCustomer1.getPrice());




    }
}
