package com.gla.arrays.Level2;
import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // use long to allow larger numbers

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // b. Initial array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // c. Extract digits and dynamically expand array if needed
        while (number != 0) {
            int lastDigit = (int)(number % 10);
            number /= 10;

            // f. Increase array size if full
            if (index == maxDigit) {
                maxDigit += 10;  // increase size by 10
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];  // copy existing digits
                }
                digits = temp;  // assign new larger array
            }

            digits[index] = lastDigit;
            index++;
        }

        // g. Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // h. Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
