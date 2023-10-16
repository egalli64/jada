/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s03;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

/**
 * The SequencedCollection interface
 */
public class SequenceExample {
    public static void main(String[] args) {
        // Each concrete list is-a SequencedCollection
        SequencedCollection<Integer> seq = new ArrayList<>(List.of(33, 42, 12));
        System.out.println("A sequence: " + seq);

        /*
         * addFirst and addLast
         */
        seq.addFirst(73);
        System.out.println("After addFirst(73): " + seq);
        seq.addLast(37);
        System.out.println("After addLast(37): " + seq);

        /*
         * getFirst and getLast
         */
        System.out.println("getFirst(): " + seq.getFirst());
        System.out.println("getLast(): " + seq.getLast());

        System.out.println("removeFirst(): " + seq.removeFirst());
        System.out.println("removeLast(): " + seq.removeLast());

        System.out.println("The reversed() sequence: " + seq.reversed());
    }
}
