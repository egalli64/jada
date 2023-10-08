/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m2.s06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * ArrayDeque
 */
public class ArrayDequeExample {
    /**
     * Using push() and pop() on ArrayDeque
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(List.of(42, -27, 99, 12));
        System.out.println(deque);

        deque.push(18);
        System.out.println("Stack: push adds new first (left) element " + deque);

        Integer popped = deque.pop();
        System.out.println("Stack: pop removes the first (left) element " + popped);
        System.out.println(deque);
    }
}
