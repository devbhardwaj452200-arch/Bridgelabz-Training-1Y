package com.gla.Polymorphism;

class Calculator {

    // Addition methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Subtraction methods
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication methods
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    // Division methods
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Cannot divide by zero");
            return 0.0;
        }
        return a / b;
    }
}