package Extras1;
import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {

        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    // Function to take input from the user
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            System.exit(0);
        }
        return num;
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * calculateFactorial(n - 1); // recursive case
        }
    }

    // Function to display the result
    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
