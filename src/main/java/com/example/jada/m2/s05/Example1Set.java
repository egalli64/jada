/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s05;

import java.util.HashSet;
import java.util.Set;

/**
 * The Set interface
 */
public class Example1Set {
    public static void main(String[] args) {
        // Use an unmodifiable set to create a HashSet, seen as a Set
        Set<Integer> set = new HashSet<>(Set.of(18, 51, 26, 12, 31));

        System.out.println("A set: " + set);
        System.out.println("add(null) changes the set? " + set.add(null)); // true
        // all null are considered equal
        System.out.println("add(null) changes the set? " + set.add(null)); // false
        System.out.println("A set could contain a single null: " + set);

        try {
            Set.of((Integer) null);
            System.out.println("Unexpected! An unmodifiable set can't contain null");
        } catch (NullPointerException npe) {
            System.out.println("A concrete set could refuse to accept null: " + npe);
        }

        // no duplicated accepted in a set
        System.out.println("add(26) changes the set? " + set.add(26)); // false
        // a modifiable set accept the remove on any of its elements
        System.out.println("remove(null) changes the set? " + set.remove(null)); // true
    }
}
