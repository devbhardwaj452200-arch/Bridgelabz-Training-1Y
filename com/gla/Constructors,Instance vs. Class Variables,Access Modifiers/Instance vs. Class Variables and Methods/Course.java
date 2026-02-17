// Course class
class Course {
    // Instance variables (unique to each course)
    String courseName;
    int duration; // in weeks
    double fee;

    // Class variable (shared among all courses)
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name     : " + courseName);
        System.out.println("Duration (weeks): " + duration);
        System.out.println("Fee             : " + fee);
        System.out.println("Institute Name  : " + instituteName);
        System.out.println();
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("Java Programming", 12, 15000.0);
        Course c2 = new Course("Data Science", 16, 25000.0);

        // Displaying initial course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating institute name using class method
        Course.updateInstituteName("XYZ Academy");

        // Displaying course details after institute name update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
