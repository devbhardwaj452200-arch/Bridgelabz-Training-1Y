import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;      // Initialize result
        int counter = 0;     // Initialize counter

        // Loop using while
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Display result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}
