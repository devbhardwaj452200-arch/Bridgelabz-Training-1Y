package com.gla.arrays.Level2;
import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Arrays for salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // c. Arrays for bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Take input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            // Validate input
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to retry
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // e. Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Display results
        System.out.println("\n--- Zara Bonus Summary ---");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

        sc.close();
    }
}
