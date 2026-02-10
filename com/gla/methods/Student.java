package com.gla.methods;

public class Student {
    int roll_no;
    String name;
    String course;
    Double cpi;

    public static void main(){
        Student s1 =new Student();
        s1.name="Rahul";
        s1.course="B.Tech";
        s1.cpi=6.5;
        s1.roll_no=18;

        Student s2 =new Student();
        s2.name="Rakesh";
        s2.course="B.Tech";
        s2.cpi=8.5;
        s2.roll_no=20;

        System.out.println(s1.name);
        System.out.println(s1.course);
        System.out.println(s1.cpi);
        System.out.println(s1.roll_no);

        System.out.println(s2.name);
        System.out.println(s2.course);
        System.out.println(s2.cpi);
        System.out.println(s2.roll_no);
    }
}
