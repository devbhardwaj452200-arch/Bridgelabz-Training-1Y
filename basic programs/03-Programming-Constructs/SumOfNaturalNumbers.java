import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if natural number
        if (n > 0) {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingLoop = 0;
            int i = 1;

            // Sum using while loop
            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

            // Output results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);

            // Compare results
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are not equal.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}
