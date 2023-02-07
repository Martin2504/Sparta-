package com.sparta.f_SOLID_Principles.D;

// The lightBulb is the low-level module
// Instead of having LightBulb details here, now i have appliance instead.
// It no longer relies on LightBulb.
// Anything that implements Switchable can use this method.
public class ElectricPowerSwitch {
//    public LightBulb lightbulb;
    public Switchable applicance;
    public boolean on;

    public ElectricPowerSwitch(Switchable applicance) {
        this.applicance = applicance;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            applicance.turnOff();
            this.on = false;
        } else {
            applicance.turnOn();
            this.on = true;
        }
    }
}
