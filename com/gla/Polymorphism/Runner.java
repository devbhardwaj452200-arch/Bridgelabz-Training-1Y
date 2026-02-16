package com.gla.Polymorphism;

public class Runner {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Integer operations
        int intAdd = calc.add(20, 10);
        int intSub = calc.subtract(20, 5);
        int intMul = calc.multiply(4, 6);
        int intDiv = calc.divide(15, 4);

        System.out.println("=== Integer Operations ===");
        System.out.println("Addition: " + intAdd);
        System.out.println("Subtraction: " + intSub);
        System.out.println("Multiplication: " + intMul);
        System.out.println("Division: " + intDiv);

        // Double operations
        double doubleAdd = calc.add(20.5, 10.3);
        double doubleSub = calc.subtract(20.5, 5.2);
        double doubleMul = calc.multiply(4.5, 6.0);
        double doubleDiv = calc.divide(15.0, 4.0);

        System.out.println("\n=== Double Operations ===");
        System.out.println("Addition: " + doubleAdd);
        System.out.println("Subtraction: " + doubleSub);
        System.out.println("Multiplication: " + doubleMul);
        System.out.println("Division: " + doubleDiv);
    }
}

