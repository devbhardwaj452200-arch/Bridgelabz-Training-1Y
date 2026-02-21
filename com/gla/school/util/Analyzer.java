package com.school.util;

import com.school.data.Student;

public class Analyzer {

    public double calculateAverage(Student s) {
        return (s.getMark1() + s.getMark2() + s.getMark3()) / 3.0;
    }

    public String findGrade(double average) {
        if (average >= 90)
            return "A";
        else if (average >= 75)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 40)
            return "D";
        else
            return "F";
    }
}