package com.gla.abstraction;

// Mobile interface
public interface Mobile {
    String brand = "Apple";
    String color = "Silver";

    void processor();
    void battery();
}

// iPhone class implementing Mobile
class iPhone implements Mobile {

    @Override
    public void processor() {
        System.out.println("Processor: A17 Bionic Chip");
    }

    @Override
    public void battery() {
        System.out.println("Battery: 3095 mAh");
    }
}

