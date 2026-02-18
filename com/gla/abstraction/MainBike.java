package com.gla.abstraction;

public class MainBike {
    public static void main(String[] args) {
        // Create object of S100RR
        S100RR bike = new S100RR();

        // Access interface constants
        System.out.println("Company: " + Bike.company);
        System.out.println("Color: " + Bike.color);

        // Call methods
        bike.engine();
        bike.speed();
    }
}
