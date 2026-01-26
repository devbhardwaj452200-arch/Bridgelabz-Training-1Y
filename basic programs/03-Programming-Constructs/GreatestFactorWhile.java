import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        // Initialize counter
        int counter = number - 1;

        // Loop using while
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Display result
        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        sc.close();
    }
}
