package com.gla.multithreading;

class Thread4 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread4: " + i);
        }
    }

    public static void main(String[] args) {
        Thread4 obj = new Thread4();   // Runnable object
        Thread t = new Thread(obj);    // Thread object

        t.start(); // starts thread
    }
}
