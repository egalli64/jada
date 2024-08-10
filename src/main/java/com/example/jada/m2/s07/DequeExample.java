/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * The Deque interface
 */
public class DequeExample {
    public static void main(String[] args) {
        // Use an unmodifiable list to create an ArrayDeque, seen as a Deque
        Deque<Integer> deque = new ArrayDeque<>(List.of(18, 51, 26));

        System.out.println("A deque " + deque);
        System.out.println("offerFirst(12) has inserted 12 as new head? " + deque.offerFirst(12)); // true
        deque.addFirst(42);
        System.out.println("if addFirst(42) fails, an IllegalStateException is thrown");

        System.out.println("pollLast() retrieves and removes the tail (or null): " + deque.pollLast()); // 26
        System.out.println("removeLast() retrieves and removes the tail (or throws): " + deque.removeLast()); //51

        System.out.println("peekLast() retrieves the tail (or null): " + deque.peekLast()); // 18
        System.out.println("getLast() retrieves the tail (or throws): " + deque.getLast()); // 18

        // Deque as a stack
        System.out.println("pop() retrieves and removes the head (or throws): " + deque.pop()); //42
        deque.push(6);
        System.out.println("push(6) insert 6 as new head (or throws)");

        System.out.println("The resulting deque: " + deque);
    }
}
