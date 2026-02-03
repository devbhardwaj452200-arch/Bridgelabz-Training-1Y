package com.gla.arrays.Level2;
import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // b. 2D array to store marks [student][subject]
        // Columns: 0 = Physics, 1 = Chemistry, 2 = Maths
        double[][] marks = new double[n][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks for each student with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    double mark = sc.nextDouble();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input! Marks must be positive. Enter again.");
                    }
                }
            }
        }

        // d. Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = (total / 300) * 100; // assuming max marks per subject = 100

            // Assign grade based on percentage
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        // e. Display marks, percentage, and grade
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-12.2f %-10c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
