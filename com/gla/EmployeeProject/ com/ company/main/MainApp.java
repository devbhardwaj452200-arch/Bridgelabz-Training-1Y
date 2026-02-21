package com.company.main;

// Single class import
import com.company.hr.Employee;
// On-demand import
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee(101, "Amit Kumar", "IT", 50000);

        // Display employee details
        System.out.println("---- Employee Details ----");
        emp.displayEmployee();

        // Calculate bonus using Payroll
        Payroll payroll = new Payroll();
        double totalSalary = payroll.calculateBonus(emp);

        System.out.println("\n---- Salary After 10% Bonus ----");
        System.out.println("Total Salary: " + totalSalary);
    }
}