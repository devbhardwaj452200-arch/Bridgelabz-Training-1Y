// Student class
class Student {
    public int rollNumber;       // Public: accessible anywhere
    protected String name;       // Protected: accessible in subclass and package
    private double CGPA;         // Private: accessible only within the class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
        System.out.println();
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {
    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member 'name' from superclass
        System.out.println("PG Student Name        : " + name);
        System.out.println("Roll Number            : " + rollNumber); // public accessible
        System.out.println("CGPA                   : " + getCGPA()); // private accessed via public method
        System.out.println("Specialization         : " + specialization);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating a regular Student object
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();

        // Modifying CGPA using public method
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA for " + s1.name + ": " + s1.getCGPA());
        System.out.println();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Data Science");
        pg1.displayPostgraduateDetails();
    }
}
