package com.gla.ExceptionHandaling;
public class ExceptionHandaling1
{
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int[] arr={1,2,3};
        String str=null;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){  //ArithmeticException
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){ //ArrayIndexOutOfBoundsException
            System.out.println(e.getMessage());

        }
        try{
            System.out.println(str);
        }
        catch(NullPointerException e){           //NullPointerException
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally execute");
        }
    }
}