package Extras1;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        sc.close();
    }

    // Function to check whether a number is prime
    public static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
