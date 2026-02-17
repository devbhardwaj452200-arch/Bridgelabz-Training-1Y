// Employee class
class Employee {
    public int employeeID;       // Public: accessible anywhere
    protected String department; // Protected: accessible in subclass and package
    private double salary;       // Private: accessible only within the class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set/modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println();
    }
}

// Subclass demonstrating access to public and protected members
class Manager extends Employee {
    String team;

    // Constructor
    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Display manager details
    public void displayManagerDetails() {
        // Accessing protected member 'department' and public member 'employeeID'
        System.out.println("Manager Details:");
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + getSalary()); // private via public method
        System.out.println("Team        : " + team);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating an Employee object
        Employee e1 = new Employee(1001, "IT", 50000.0);
        e1.displayEmployeeDetails();

        // Modifying salary using public method
        e1.setSalary(55000.0);
        System.out.println("Updated Salary: " + e1.getSalary());
        System.out.println();

        // Creating a Manager object
        Manager m1 = new Manager(2001, "HR", 75000.0, "Recruitment Team");
        m1.displayManagerDetails();
    }
}
