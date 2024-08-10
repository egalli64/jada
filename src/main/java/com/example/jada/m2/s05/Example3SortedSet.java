/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s05;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * The SortedSet interface
 */
public class Example3SortedSet {
    public static void main(String[] args) {
        // Use an unmodifiable set to create a TreeSet, seen as a SortedSet
        SortedSet<Integer> sorted = new TreeSet<>(Set.of(18, 51, 26, 12, 31));
        System.out.println("A sorted set " + sorted);
        System.out.println("headSet [..., 26): " + sorted.headSet(26));
        System.out.println("tailSet [26, ...]: " + sorted.tailSet(26));
        System.out.println("subSet [18, 31): " + sorted.subSet(18, 31));
    }
}
