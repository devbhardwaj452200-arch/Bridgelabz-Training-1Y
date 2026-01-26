import java.math.BigInteger;
import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if natural number
        if (number >= 0) {
            BigInteger factorial = BigInteger.ONE;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            // Output
            System.out.println("The factorial of " + number + " is:");
            System.out.println(factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        sc.close();
    }
}
