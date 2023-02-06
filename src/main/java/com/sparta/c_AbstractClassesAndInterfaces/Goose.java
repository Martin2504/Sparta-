package com.sparta.c_AbstractClassesAndInterfaces;

public class Goose extends Bird implements CanFly {

    @Override
    public void fly() {
        System.out.println("Goose flies");
    }
}
