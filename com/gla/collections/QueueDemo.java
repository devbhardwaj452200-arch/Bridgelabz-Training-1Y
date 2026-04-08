package com.gla.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    private Queue queue;

    // Constructor
    public QueueDemo() {
        queue = new LinkedList();
    }

    // Add element
    public void enqueue(Object element) {
        queue.add(element);
        System.out.println(element + " added to queue");
    }

    // Remove element
    public Object dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Object removed = queue.poll();
        System.out.println(removed + " removed from queue");
        return removed;
    }

    // Peek front element
    public Object peek() {
        return queue.peek();
    }

    // Display queue
    public void display() {
        System.out.println("Queue elements: " + queue);
    }

    // Main method
    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        q.enqueue(10);
        q.enqueue("Hello");
        q.enqueue(25.5);

        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
