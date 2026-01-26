import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Check eligibility for bonus
        if (years > 5) {
            bonus = salary * 0.05;
        }

        // Print bonus amount
        System.out.println("Bonus amount: " + bonus);

        sc.close();
    }
}
