package colleges.main;

// Normal imports
import college.student.Student;
import college.facultys.Faculty;
import college.department.Department;

// Static import
import static java.lang.Math.*;

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101, "Computer Science");
        Faculty f1 = new Faculty("Dr. Sharma", "Java Programming", 75000);
        Department d1 = new Department("Computer Science", "Dr. Mehta");

        System.out.println("===== College Management System =====\n");

        System.out.println("--- Student Details ---");
        System.out.println(s1);

        System.out.println("\n--- Faculty Details ---");
        System.out.println(f1);

        System.out.println("\n--- Department Details ---");
        System.out.println(d1);

        // Using static import (Math.round)
        double bonus = f1.getSalary() * 0.10;
        System.out.println("\nFaculty Bonus (10%): " + round(bonus));
    }
}