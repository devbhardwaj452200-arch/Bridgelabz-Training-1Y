// Base class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("\nManager Details:");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("\nDeveloper Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    int duration; // in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("\nIntern Details:");
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {

        // Polymorphism
        Employee[] employees = new Employee[3];

        employees[0] = new Manager("Rahul", 101, 80000, 10);
        employees[1] = new Developer("Anita", 102, 60000, "Java");
        employees[2] = new Intern("Ravi", 103, 15000, 6);

        // Loop through employees
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
