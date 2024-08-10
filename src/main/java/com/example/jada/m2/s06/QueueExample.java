/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s06;

import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * The Queue interface
 */
public class QueueExample {
    public static void main(String[] args) {
        // Use an unmodifiable list to create an ArrayDeque, seen as a Queue
        Queue<Integer> queue = new ArrayDeque<>(List.of(18, 51, 26));

        System.out.println("A queue " + queue);
        System.out.println("offer(12) has inserted the element? " + queue.offer(12)); // true
        System.out.println("if add(42) fails, an IllegalStateException is thrown: " + queue.add(42)); // true

        System.out.println("poll() retrieves and removes the head (or null): " + queue.poll()); // 18
        System.out.println("remove() retrieves and removes the head (or throws): " + queue.remove()); // 51

        System.out.println("peek() retrieves the head (or null): " + queue.peek()); // 26
        System.out.println("element() retrieves the head (or throws): " + queue.element()); // 26

        queue.clear();
        try {
            System.out.println("Polling an empty queue leads to " + queue.poll()); // null
            queue.remove();
            System.out.println("Unexpected! Queue should have been empty");
        } catch (NoSuchElementException ex) {
            System.out.println("Removing an empty queue leads to " + ex);
        }
    }
}
