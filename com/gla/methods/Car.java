package com.gla.methods;

public class Car {
    String colour;
    String company;
    String model;
    String type;
    int capacity;
    static String manufacturerLocation = "India";

    public static void main(String[] args) {
        // First Car
        Car car1 = new Car();
        car1.colour = "Red";
        car1.company = "Toyota";
        car1.model = "Corolla";
        car1.type = "Sedan";
        car1.capacity = 5;

        System.out.println("Car 1 Details:");
        System.out.println("Colour: " + car1.colour);
        System.out.println("Company: " + car1.company);
        System.out.println("Model: " + car1.model);
        System.out.println("Type: " + car1.type);
        System.out.println("Capacity: " + car1.capacity);
        System.out.println("Manufacturer Location: " + Car.manufacturerLocation);

        System.out.println();

        // Second Car
        Car car2 = new Car();
        car2.colour = "Blue";
        car2.company = "Honda";
        car2.model = "Civic";
        car2.type = "Sedan";
        car2.capacity = 5;

        System.out.println("Car 2 Details:");
        System.out.println("Colour: " + car2.colour);
        System.out.println("Company: " + car2.company);
        System.out.println("Model: " + car2.model);
        System.out.println("Type: " + car2.type);
        System.out.println("Capacity: " + car2.capacity);
        System.out.println("Manufacturer Location: " + Car.manufacturerLocation);
    }
}
