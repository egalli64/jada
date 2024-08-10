/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s05;

import java.util.SequencedSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The Set-family interfaces
 */
public class Example2SequencedSet {
    public static void main(String[] args) {
        // Use an unmodifiable set to create a TreeSet, seen as a SequencedSet
        SequencedSet<Integer> seq = new TreeSet<>(Set.of(18, 51, 26, 12, 31));
        // The sequence order is the one determined by the TreeSet nature
        System.out.println("A sequenced set " + seq);

        try {
            // We can't force the ordering
            seq.addFirst(99);
            System.out.println("Unexpected!");
        } catch (UnsupportedOperationException ex) {
            System.out.println("addFirst()/addLast() not supported by the concrete class: " + ex);
        }

        System.out.println("The reversed sequence: " + seq.reversed());
    }
}
