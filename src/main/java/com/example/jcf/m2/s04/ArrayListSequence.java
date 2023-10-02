/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s04;

import java.util.ArrayList;
import java.util.SequencedCollection;

/**
 * ArrayList, using SequencedCollection methods
 */
public class ArrayListSequence {
    /**
     * Using an ArrayList as a SequencedCollection
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        SequencedCollection<Integer> seq = new ArrayList<>();
        System.out.println("An empty sequence: " + seq);

        // adding an element in the last position
        seq.addLast(56);
        // adding an element in the first position
        seq.addFirst(18);
        System.out.println("After adding elements: " + seq);

        seq = seq.reversed();
        System.out.println("After reversing: " + seq);

        System.out.println("First element is: " + seq.getFirst());
        System.out.println("Last element is: " + seq.getLast());

        System.out.println("First element was: " + seq.removeFirst());
        System.out.println("Last element was: " + seq.removeLast());

        System.out.println("Now the sequence is: " + seq);
    }
}
