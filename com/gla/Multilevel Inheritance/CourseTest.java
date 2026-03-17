// Base class
class Course {
    String courseName;
    int duration; // in hours

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Intermediate class
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        System.out.println("\nOnline Course Details:");
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Derived class (Multilevel)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        System.out.println("\nPaid Online Course Details:");
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price: " + finalPrice);
    }
}

// Main class
public class CourseTest {
    public static void main(String[] args) {

        // Object of final derived class
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                40,
                "Udemy",
                true,
                5000,
                20
        );

        course.displayInfo();
    }
}
