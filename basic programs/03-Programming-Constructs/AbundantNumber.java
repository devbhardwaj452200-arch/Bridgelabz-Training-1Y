import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0; // Step c: Initialize sum of divisors

        // Step d: Loop through all numbers less than the number
        for (int i = 1; i < number; i++) {
            // Step e: Check if i is a divisor
            if (number % i == 0) {
                sum += i; // Step f: Add divisor to sum
            }
        }

        // Step g & h: Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}
