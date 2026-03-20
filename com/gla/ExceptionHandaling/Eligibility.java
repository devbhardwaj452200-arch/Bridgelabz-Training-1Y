package com.gla.ExceptionHandaling;

public class Eligibility {
    static void ageChecker(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }
        System.out.println("Valid age");
    }
    static void main(String[] args){
        ageChecker(100);
    }
}
