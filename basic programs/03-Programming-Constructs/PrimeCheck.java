import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // assume number is prime initially

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num-1
            for (int i = 2; i <= num / 2; i++) { // optimization: check up to num/2
                if (num % i == 0) {
                    isPrime = false; // divisible by a number other than 1 and itself
                    break; // no need to check further
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
