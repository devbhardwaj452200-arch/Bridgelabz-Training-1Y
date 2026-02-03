package com.gla.arrays.Level2;
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        // b. Find count of digits
        long temp = number;
        int count = 0;
        if (temp == 0) count = 1;  // edge case for 0
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // c. Find digits and store in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);  // get last digit
            temp /= 10;
        }

        // d. Create array for reversed digits (optional since digits already stored in reverse order)
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // e. Display reversed number
        System.out.print("Reversed number: ");
        if (isNegative) System.out.print("-");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);  // digits array already stores in reverse order
        }
        System.out.println();

        sc.close();
    }
}
