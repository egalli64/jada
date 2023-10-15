/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s09;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class TreeSetExample {
    /**
     * Using TreeSet functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> data = List.of(5, 8, 99);

        SortedSet<Integer> set = new TreeSet<>(data);
        System.out.println("The sorted set: " + set);

        if (set.add(42)) {
            System.out.println("42 added to set: " + set);
        }
        if (set.contains(99)) {
            System.out.println("The set contains 99");
        }
        if (!set.remove(81)) {
            System.out.println("Can't remove 81, not in the set");
        }

        try {
            set.addFirst(142);
        } catch (UnsupportedOperationException ex) {
            System.out.println("A SortedSet is-a SequencedSet, but addFirst/last do not make sense here");
        }

        System.out.println("The set, reversed: " + set.reversed());
    }
}
