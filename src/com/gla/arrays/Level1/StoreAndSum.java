package com.gla.arrays.Level1;
import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Array of 10 doubles, total initialized to 0.0, index = 0
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // c. Break if 0 or negative number is entered
            if (input <= 0) {
                break;
            }

            // d. Break if array limit reached
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            // e. Store value in array and increment index
            numbers[index] = input;
            index++;
        }

        // f. Loop to calculate total
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        // g. Display total
        System.out.println("Sum of all numbers = " + total);

        sc.close();
    }
}
