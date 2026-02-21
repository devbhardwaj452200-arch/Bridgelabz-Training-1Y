package com.bank.main;

import com.bank.util.InterestCalculator;

// Static Import of Math class
import static java.lang.Math.*;

public class BankApp {

    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;     // 5%
        double time = 2;     // 2 years

        InterestCalculator calculator = new InterestCalculator();

        // Simple Interest
        double si = calculator.calculateSimpleInterest(principal, rate, time);

        // Compound Interest using static import pow()
        double ci = principal * (pow((1 + rate / 100), time)) - principal;

        System.out.println("---- Banking System ----");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");

        System.out.println("\nSimple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}