package com.company.analytics.main;

import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class CompanyApp {

    public static void main(String[] args) {

        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        System.out.println("===== Company Combined Analytics Report =====\n");

        sales.printSalesData();
        hr.printEmployeeData();
    }
}