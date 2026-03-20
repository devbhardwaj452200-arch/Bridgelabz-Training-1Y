package com.gla.ExceptionHandaling;

public class ExceptionHandling3 {
    static void main(String[] args){
        try{
            int a=10/0;
            System.out.println(a);
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        finally{
            System.out.println("I Executed every time");
        }
    }
}
