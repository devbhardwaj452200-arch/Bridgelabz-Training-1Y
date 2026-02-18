package com.gla.abstraction;

// Main class to test Mobile
public class MainMobile {
    public static void main(String[] args) {
        Mobile myPhone = new iPhone(); // Create object of iPhone
        System.out.println("Brand: " + Mobile.brand);
        System.out.println("Color: " + Mobile.color);
        myPhone.processor();
        myPhone.battery();
    }
}
