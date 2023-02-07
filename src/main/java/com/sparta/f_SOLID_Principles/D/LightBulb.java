package com.sparta.f_SOLID_Principles.D;

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: bulb turned on...");
    }

    public void turnOff() {
        System.out.println("LightBulb; bulb turned off...");
    }
}
