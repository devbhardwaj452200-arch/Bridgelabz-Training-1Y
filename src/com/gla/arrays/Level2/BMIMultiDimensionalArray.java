package com.gla.arrays.Level2;
import java.util.Scanner;

public class BMIMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. Multi-dimensional array: [person][0=weight,1=height,2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input for weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            double weight;
            while (true) {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Invalid input! Weight must be positive.");
            }

            double height;
            while (true) {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Invalid input! Height must be positive.");
            }

            personData[i][0] = weight;  // weight
            personData[i][1] = height;  // height
        }

        // d. Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;  // store BMI

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
