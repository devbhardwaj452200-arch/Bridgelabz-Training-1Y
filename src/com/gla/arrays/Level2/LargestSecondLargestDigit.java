package com.gla.arrays.Level2;
import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // b. Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d, e, f. Extract digits and store in array
        while (number != 0) {
            int lastDigit = number % 10;  // e. Get last digit
            digits[index] = lastDigit;
            index++;
            number /= 10;  // Remove last digit

            if (index == maxDigit) {
                break;  // f. Limit array to maxDigit
            }
        }

        // g. Variables to store largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
