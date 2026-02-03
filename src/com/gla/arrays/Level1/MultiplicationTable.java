package com.gla.arrays.Level1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array to store multiplication results (1 to 10)
        int[] table = new int[10];

        // b. Loop from 1 to 10 and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // c. Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
