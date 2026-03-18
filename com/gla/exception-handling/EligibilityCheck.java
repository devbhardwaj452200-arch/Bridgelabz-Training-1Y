import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class EligibilityCheck {

    // Method using throws
    static void checkEligibility(int age) throws InvalidAgeException {

        // Using throw
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        else if (age < 18) {
            throw new InvalidAgeException("Not eligible for voting!");
        }
        else {
            System.out.println("You are eligible for voting ✅");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");

            // May cause InputMismatchException (Unchecked)
            int age = sc.nextInt();

            // Calling method (Checked Exception)
            checkEligibility(age);

            // Example of ArithmeticException (Unchecked)
            int test = 10 / (age - age); // will crash if not handled

        }

        // Handling unchecked exception
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Division by zero!");
        }

        // Handling input error
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        // Handling custom exception
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // Finally block
        finally {
            System.out.println("Program executed successfully (finally block).");
            sc.close();
        }
    }
}
