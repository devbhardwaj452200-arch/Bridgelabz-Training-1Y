package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 85, 78, 92);

        Analyzer analyzer = new Analyzer();

        double average = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(average);

        System.out.println("---- Student Performance Report ----");
        System.out.println(s1);   // Calls toString()
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}