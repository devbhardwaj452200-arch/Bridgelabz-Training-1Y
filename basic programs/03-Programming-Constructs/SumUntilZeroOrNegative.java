import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Break condition
            if (number <= 0) {
                break;
            }

            total += number;
        }

        // Output
        System.out.println("The total is: " + total);

        sc.close();
    }
}
