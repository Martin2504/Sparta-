package com.sparta.k_Design_Patterns.Factory_Method;

public class HelicopterFactory extends VehicleFactory{
    @Override
    public Vehicle getInstance() {
        return new Helicopter();
    }
}
