/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s12;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * The SortedMap interface
 */
public class SortedMapExample {
    public static void main(String[] args) {
        // A (modifiable) tree map
        TreeMap<Integer, String> tree = new TreeMap<>(Map.ofEntries(Map.entry(2, "two")));

        // TreeMap is-a SortedMap
        SortedMap<Integer, String> seq = tree;
        System.out.println("A sequenced map: " + seq);

        /**
         * Inserter
         */
        System.out.println("putFirst(1, \"one\") returns " + seq.putFirst(1, "one"));
        System.out.println("putLast(3, \"three\") returns " + seq.putLast(3, "three"));
        System.out.println("Now the sequenced map is " + seq);

        /*
         * Getters
         */
        System.out.println("firstEntry() returns " + seq.firstEntry());
        System.out.println("lastEntry() returns " + seq.lastEntry());

        /**
         * Removers
         */
        System.out.println("pollFirstEntry() returns " + seq.pollFirstEntry());
        System.out.println("pollLastEntry() returns " + seq.pollLastEntry());
        System.out.println("Now the map is " + seq);

        // making things a bit more interesting
        seq.putFirst(1, "one");

        /*
         * Views
         */
        System.out.println("The sequencedKeySet() is " + seq.sequencedKeySet());
        System.out.println("The sequencedValues() is " + seq.sequencedValues());
        System.out.println("The sequencedEntrySet() is " + seq.sequencedEntrySet());

        System.out.println("The reversed() sequence is " + seq.reversed());
    }
}
