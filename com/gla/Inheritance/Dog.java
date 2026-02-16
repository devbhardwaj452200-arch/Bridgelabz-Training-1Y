package com.gla.Inheritance;

class Dog extends Animal {

    // Dog-specific method
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }

    // Overriding walk method
    @Override
    void walk() {
        System.out.println("Dog walks on 4 legs");
    }
}