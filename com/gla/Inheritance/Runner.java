package com.gla.Inheritance;

public class Runner {
    public static void main(String[] args) {

        Dog myDog = new Dog();

        // Using inherited methods
        myDog.walk();

        // Using Dog-specific method
        myDog.sound();
    }
}