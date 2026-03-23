
package com.gla.Typecasting;

class Vehicle {
    void display() {
        System.out.println("Vehicle class");
    }
}

class Maruti extends Vehicle {
    void speed() {
        System.out.println("Car run fast");
    }
}

class TypeCastingDemo {
    public static void main(String[] args) {
        Maruti obj = new Maruti();  // Upcasting
        // Down casting

        obj.display();
        obj.speed();
    }
}
