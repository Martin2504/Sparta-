package com.sparta.k_Design_Patterns.Factory_Method;

import java.util.Scanner;


// Rather than creating cars and helicopters manually,
// I have the getVehicle method call the relevant factory,
// create an instance of that factory and call the getInstance()
// on whichever factory it has created.

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter desired vehicle: ");
        Scanner scanner = new Scanner(System.in);
        String desiredVehicle = scanner.next();
        Vehicle v = getVehicle(desiredVehicle);
        v.drive();

//        Vehicle c = getVehicle("car");
//        Vehicle h = getVehicle("heli");
//        c.drive();
//        h.drive();

    }

    // factory method
    public static Vehicle getVehicle(String vehicleType) {
        VehicleFactory vFactory;
        if (vehicleType.equals("car")) {
            vFactory = new CarFactory();
        } else if (vehicleType.equals("heli")) {
            vFactory = new HelicopterFactory();
        } else {
            System.out.println("Please enter a valid vehicle name");
            return null;
        }
        return vFactory.getInstance();
    }
}
