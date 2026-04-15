import java.util.*;

public class EmployeeSalary {

    public static void main(String[] args) {

        // Step 1: Create Map (employee -> salary)
        Map<String, Double> employees = new HashMap<>();

        employees.put("Aman", 50000.0);
        employees.put("Riya", 60000.0);
        employees.put("Karan", 55000.0);
        employees.put("Sneha", 70000.0);
        employees.put("Rahul", 65000.0);
        employees.put("Neha", 70000.0);

        // Step 2: Give raises
        giveRaise(employees, "Aman", 10);   // +10%
        giveRaise(employees, "Riya", 5);    // +5%
        giveRaise(employees, "Karan", 8);   // +8%
        giveRaise(employees, "John", 10);   // not found

        // Print updated salaries
        System.out.println("Updated Salaries:");
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 3: Calculate average salary
        double sum = 0;
        for (double salary : employees.values()) {
            sum += salary;
        }

        double avg = sum / employees.size();
        System.out.println("\nAverage Salary: " + avg);

        // Step 4: Find highest-paid employee(s)
        double maxSalary = 0;

        for (double salary : employees.values()) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("\nHighest Paid Employee(s):");
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    // Method to give raise
    public static void giveRaise(Map<String, Double> employees, String name, double percent) {
        if (employees.containsKey(name)) {
            double currentSalary = employees.get(name);
            double newSalary = currentSalary + (currentSalary * percent / 100);
            employees.put(name, newSalary);
            System.out.println(name + " salary updated to " + newSalary);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }
}
