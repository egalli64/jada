/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s04;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList, using SequencedCollection methods
 */
public class ArrayListSequence {
    /**
     * A few methods from ArrayList
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("An empty list: " + list);

        // adding an element in the last position
        list.addLast(56);
        // adding an element in the first position
        list.addFirst(18);
        System.out.println("After adding elements: " + list);

        System.out.println("First element is: " + list.getFirst());
        System.out.println("Last element is: " + list.getLast());

        System.out.println("First element was: " + list.removeFirst());
        System.out.println("Last element was: " + list.removeLast());

        System.out.println("Now list is: " + list);
    }
}
