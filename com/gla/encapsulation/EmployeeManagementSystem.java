// Department Interface
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Abstract Class Employee
abstract class Employee implements Department {
    // Encapsulated fields (private)
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------------");
    }

    // Department interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed monthly salary
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {

    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    // Getters and Setters
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Polymorphism: Employee reference
        Employee emp1 = new FullTimeEmployee(101, "Alice", 5000);
        Employee emp2 = new PartTimeEmployee(102, "Bob", 20, 80);

        emp1.assignDepartment("HR");
        emp2.assignDepartment("IT");

        // Processing list of employees
        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();  // Polymorphic call
        }
    }
}
