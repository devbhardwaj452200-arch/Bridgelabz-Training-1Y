package com.gla.collections;
import java.util.*;
public class Queue {
    public static void main(String[] args){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(34);
        pq.offer(2);
        pq.offer(45);
        pq.offer(98);

        pq.poll();
        System.out.println(pq.element());
    }
}
