import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Calling validation method
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Handling custom exception
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
