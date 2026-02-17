// Employee class
class Employee {
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Employee class
        Employee emp1 = new Employee();

        // Assigning values to object
        emp1.name = "John Doe";
        emp1.id = 101;
        emp1.salary = 50000.0;

        // Calling method using object
        emp1.displayDetails();
    }
}
