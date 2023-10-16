/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s06;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * The Queue interface
 */
public class QueueExample {
    public static void main(String[] args) {
        // An array deque
        ArrayDeque<Integer> array = new ArrayDeque<>(List.of(18, 51, 26));

        // ArrayDeque is-a Queue
        Queue<Integer> queue = array;

        System.out.println(" Operating on Queue " + queue);
        System.out.println("offer(12) has inserted the element? " + queue.offer(12));
        System.out.println("if add(42) fails, an IllegalStateException is thrown: " + queue.add(42));

        System.out.println("poll() retrieves and removes the head (or null): " + queue.poll());
        System.out.println("remove() retrieves and removes the head (or throws): " + queue.remove());

        System.out.println("peek() retrieves the head (or null): " + queue.peek());
        System.out.println("element() retrieves the head (or throws): " + queue.element());
    }
}
