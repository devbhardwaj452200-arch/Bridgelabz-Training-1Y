package com.access.one;

public class Base {

    public void publicMethod() {
        System.out.println("Public Method - Accessible Everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method - Accessible in subclass (even in another package)");
    }

    void defaultMethod() {
        System.out.println("Default Method - Accessible only within same package");
    }

    private void privateMethod() {
        System.out.println("Private Method - Accessible only within same class");
    }

    // Method to call private method inside same class
    public void accessPrivateInsideClass() {
        privateMethod();
    }
}