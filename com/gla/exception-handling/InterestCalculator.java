import java.util.Scanner;

public class InterestCalculator {

    // Method that may throw an exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        // Using 'throw' to create exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Simple Interest Formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            // Calling method
            double result = calculateInterest(amount, rate, years);

            // Display result
            System.out.println("Calculated Interest: " + result);

        } catch (IllegalArgumentException e) {
            // Handling propagated exception
            System.out.println("Invalid input: Amount and rate must be positive");
        } finally {
            sc.close();
        }
    }
}
