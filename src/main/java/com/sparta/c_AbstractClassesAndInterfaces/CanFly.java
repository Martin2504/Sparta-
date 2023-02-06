package com.sparta.c_AbstractClassesAndInterfaces;

public interface CanFly {
    default void fly() {
        System.out.println("this thing flies");     // if it's not overridden this will happen.
    }
}
