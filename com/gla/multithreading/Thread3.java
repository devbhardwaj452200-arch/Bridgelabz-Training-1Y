package com.gla.multithreading;

class Thread3 extends Thread1 {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread3: " + i);
        }
    }

    public static void main(String[] args) {
        Thread3 t = new Thread3();
        t.start(); // now works correctly
    }
}
