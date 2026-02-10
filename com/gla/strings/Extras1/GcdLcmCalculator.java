package Extras1;
import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {

        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        displayResult(a, b, gcd, lcm);
    }

    // Function to take input from the user
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        return nums;
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("Numbers: " + a + " and " + b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
