import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Division
            int result = num1 / num2;

            // Display result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero");

        } catch (InputMismatchException e) {
            // Handles non-numeric input
            System.out.println("Error: Please enter valid numeric values");

        } finally {
            // Always executes
            sc.close();
            System.out.println("Program finished.");
        }
    }
}

