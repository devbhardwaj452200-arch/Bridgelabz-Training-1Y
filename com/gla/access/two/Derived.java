package com.access.two;

import com.access.one.Base;

public class Derived extends Base {

    public void testAccess() {

        System.out.println("Testing Access Modifiers from Subclass (Different Package)\n");

        publicMethod();        // ✅ Accessible
        protectedMethod();     // ✅ Accessible (via inheritance)

        // defaultMethod();    // ❌ Not Accessible (different package)
        // privateMethod();    // ❌ Not Accessible (private)
    }

    public static void main(String[] args) {

        Derived obj = new Derived();
        obj.testAccess();
    }
}