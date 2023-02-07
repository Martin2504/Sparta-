package com.sparta.f_SOLID_Principles;

import com.sparta.f_SOLID_Principles.D.ElectricPowerSwitch;
import com.sparta.f_SOLID_Principles.D.Fan;
import com.sparta.f_SOLID_Principles.D.LightBulb;
import com.sparta.f_SOLID_Principles.D.Switchable;
import com.sparta.f_SOLID_Principles.L.Square;
import com.sparta.f_SOLID_Principles.O.Rectangle;
import com.sparta.f_SOLID_Principles.O.ShapeArea;


public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(3.0, 4.0);
        Rectangle s = new Square(3.0);
        System.out.println(ShapeArea.areaCalcRectangle(s));


        Switchable lb = new LightBulb();
        ElectricPowerSwitch ePowSwitch = new ElectricPowerSwitch(lb);
        System.out.println(ePowSwitch.isOn());
        ePowSwitch.press();
        System.out.println(ePowSwitch.isOn());

        System.out.println();

        Switchable fan = new Fan();
        ElectricPowerSwitch ePowSwitchFan = new ElectricPowerSwitch(fan);
        System.out.println(ePowSwitchFan.isOn());
        ePowSwitchFan.press();
        System.out.println(ePowSwitchFan.isOn());
    }



}
