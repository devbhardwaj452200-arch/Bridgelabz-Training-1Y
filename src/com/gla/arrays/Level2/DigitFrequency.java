package com.gla.arrays.Level2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // b. Count digits (optional, not strictly needed for frequency)
        long temp = number;
        int count = 0;
        if (temp == 0) count = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // c. Extract digits and store in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10); // get last digit
            temp /= 10;
        }

        // d. Find frequency of each digit
        int[] frequency = new int[10]; // index 0 to 9 represents digits
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency of each digit
        System.out.println("\nDigit Frequency in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }

        sc.close();
    }
}
