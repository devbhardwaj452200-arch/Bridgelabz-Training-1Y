import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;               // Step c: Initialize sum
        int originalNumber = number; // Store original number for divisibility check

        // Step d: Loop through each digit
        while (number != 0) {
            int digit = number % 10; // Get last digit
            sum += digit;            // Step e: Add digit to sum
            number = number / 10;    // Remove last digit
        }

        // Step f & g: Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
