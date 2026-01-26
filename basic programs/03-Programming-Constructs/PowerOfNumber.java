import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number <= 0 || power <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1;

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
