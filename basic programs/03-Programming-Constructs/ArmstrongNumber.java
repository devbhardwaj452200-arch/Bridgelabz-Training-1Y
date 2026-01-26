import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a & b: Input number and initialize variables
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;                   // To store sum of cubes of digits
        int originalNumber = number;    // Store original number for comparison

        // Step c: Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Step d: Get the last digit
            int digit = originalNumber % 10;

            // Step d: Cube the digit and add to sum
            sum += digit * digit * digit;

            // Step e: Remove the last digit from originalNumber
            originalNumber = originalNumber / 10;
        }

        // Step f: Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
