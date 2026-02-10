package Extras1;
import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        printFibonacci(terms);

        sc.close();
    }

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
