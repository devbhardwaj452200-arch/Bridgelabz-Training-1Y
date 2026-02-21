package com.school.data;

public class Student {
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String getName() {
        return name;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    @Override
    public String toString() {
        return "Student Name: " + name +
                "\nMarks in Subject 1: " + mark1 +
                "\nMarks in Subject 2: " + mark2 +
                "\nMarks in Subject 3: " + mark3;
    }
}