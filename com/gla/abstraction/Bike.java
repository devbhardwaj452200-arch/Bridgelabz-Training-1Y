package com.gla.abstraction;

public interface Bike {
    String color = "Black";
    String company = "BMW";

    void engine();
    void speed();
}

class S100RR implements Bike {

    @Override
    public void engine() {
        System.out.println("999 CC Inline 4 cylinder");
    }

    @Override
    public void speed() {
        System.out.println("303 km/h");
    }
}
