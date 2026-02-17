// Student class
class Student {
    String name;
    int rollNumber;
    int marks;

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "F";
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values
        s1.name = "Rahul";
        s1.rollNumber = 12;
        s1.marks = 85;

        // Displaying student report
        s1.displayDetails();
    }
}
