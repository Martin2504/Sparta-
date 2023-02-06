package com.sparta.d_OOP_Task;

public interface CanRoar {

    default String roar() {
       return "Lion had roared";
    };
}
