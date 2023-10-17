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
        // An array deque
        ArrayDeque<Integer> array = new ArrayDeque<>(List.of(18, 51, 26));

        // ArrayDeque is-a Deque
        Deque<Integer> deque = array;

        System.out.println(" Operating on Deque " + deque);
        System.out.println("offerFirst(12) has inserted 12 as new head? " + deque.offerFirst(12));
        deque.addFirst(42);
        System.out.println("if addFirst(42) fails, an IllegalStateException is thrown");

        System.out.println("pollLast() retrieves and removes the tail (or null): " + deque.pollLast());
        System.out.println("removeLast() retrieves and removes the tail (or throws): " + deque.removeLast());

        System.out.println("peekLast() retrieves the tail (or null): " + deque.peekLast());
        System.out.println("getLast() retrieves the tail (or throws): " + deque.getLast());

        // Deque as a stack
        System.out.println("pop() retrieves and removes the head (or throws): " + deque.pop());
        deque.push(6);
        System.out.println("push(6) insert 6 as new head (or throws)");

        System.out.println("The resulting deque: " + deque);
    }
}
