import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step b: Initialize count variable
        int count = 0;

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Step c: Loop until number becomes 0
        if (number == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            while (number != 0) {
                // Step d: Remove the last digit
                number = number / 10;

                // Step e: Increase count
                count++;
            }
        }

        // Step f: Display the result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
