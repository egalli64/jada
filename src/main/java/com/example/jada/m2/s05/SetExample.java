/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s05;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * The Set-family interfaces
 */
public class SetExample {
    public static void main(String[] args) {
        // A hash set
        HashSet<Integer> hash = new HashSet<>(Set.of(18, 51, 26, 12, 31));

        // HashSet is-a Set
        Set<Integer> set = hash;

        System.out.println(" Operating on Set " + set);
        System.out.println("add(null) changes the set? " + set.add(null));
        System.out.println("add(26) changes the set? " + set.add(26));
        System.out.println("remove(null) changes the set? " + set.remove(null));

        // A tree set
        TreeSet<Integer> tree = new TreeSet<>(set);

        // TreeSet is-a SequencedSet
        SequencedSet<Integer> seq = tree;
        System.out.println(" Operating on SequencedSet " + seq);
        System.out.println("Values in seq reversed: " + seq.reversed());

        // TreeSet is-a SortedSet
        SortedSet<Integer> sorted = tree;
        System.out.println(" Operating on SortedSet " + sorted);
        System.out.println("headSet [..., 26): " + sorted.headSet(26));
        System.out.println("tailSet [26, ...]: " + sorted.tailSet(26));
        System.out.println("subSet [18, 31): " + sorted.subSet(18, 31));

        // TreeSet is-a NavigableSet
        NavigableSet<Integer> nav = tree;
        System.out.println(" Operating on NavigableSet " + nav);
        System.out.println("higher(26) is " + nav.higher(26));
        System.out.println("there is nothing higher(99) ... " + nav.higher(99));
        System.out.println("ceiling(26) is " + nav.ceiling(26));
        System.out.println("lower(26) is " + nav.lower(26));
        System.out.println("there is nothing lower(12) ... " + nav.lower(12));
        System.out.println("floor(12) is " + nav.floor(12));
    }
}
