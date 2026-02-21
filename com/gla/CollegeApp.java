import college.student.Student;
import college.faculty.Faculty;

public class CollageApp {

    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student("Rahul Sharma", 101);

        // Create Faculty object
        Faculty f1 = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("---- Student Details ----");
        s1.displayStudent();

        System.out.println("\n---- Faculty Details ----");
        f1.displayFaculty();
    }
}