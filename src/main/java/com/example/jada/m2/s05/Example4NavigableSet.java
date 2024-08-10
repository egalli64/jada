/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s05;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The NavigableSet interface
 */
public class Example4NavigableSet {
    public static void main(String[] args) {
        // Use an unmodifiable set to create a TreeSet, seen as a NavigableSet
        NavigableSet<Integer> nav = new TreeSet<>(Set.of(18, 51, 26, 12, 31));
        System.out.println("A navigable set " + nav); // 12, 18, 26, 31, 51
        System.out.println("higher(26) is " + nav.higher(26)); // 31
        System.out.println("there is nothing higher(51) ... " + nav.higher(51)); // null
        System.out.println("ceiling(23) is " + nav.ceiling(23)); // 26
        System.out.println("lower(26) is " + nav.lower(26)); // 18
        System.out.println("there is nothing lower(12) ... " + nav.lower(12)); // null
        System.out.println("floor(12) is " + nav.floor(12)); // 12
    }
}
