package com.gla.WrapperClass;

public class WrapperDemo {
        public static void main(String[] args) {

            // 1. Boxing (primitive → object manually)
            int a = 10;
            Integer obj1 = Integer.valueOf(a);
            System.out.println("Boxing: " + obj1);

            // 2. Unboxing (object → primitive manually)
            Integer obj2 = new Integer(20);
            int b = obj2.intValue();
            System.out.println("Unboxing: " + b);

            // 3. Autoboxing (primitive → object automatically)
            int c = 30;
            Integer obj3 = c;  // automatic conversion
            System.out.println("Autoboxing: " + obj3);

            // 4. Auto-unboxing (object → primitive automatically)
            Integer obj4 = 40;
            int d = obj4;  // automatic conversion
            System.out.println("Auto-unboxing: " + d);
        }
    }

