/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s12;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * The SortedMap and NavigableMap interfaces
 */
public class SortedMapExample {
    public static void main(String[] args) {
        // A (modifiable) tree map
        TreeMap<Integer, String> tree = new TreeMap<>(Map.ofEntries( //
                Map.entry(1, "one"), Map.entry(2, "two"), Map.entry(3, "three")));

        // TreeMap is-a SortedMap
        SortedMap<Integer, String> sorted = tree;
        System.out.println("A sorted map: " + sorted);

        try {
            sorted.putFirst(1, "one");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't putFirst() on a sorted map: " + ex);
        }

        try {
            sorted.putLast(4, "four");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't putLast() on a sorted map: " + ex);
        }

        System.out.println("firstKey() is " + sorted.firstKey());
        System.out.println("lastKey() is " + sorted.lastKey());

        System.out.println("subMap(2, 3) is " + sorted.subMap(2, 3));
        System.out.println("headMap(2) is " + sorted.headMap(2));
        System.out.println("tailMap(2) is " + sorted.tailMap(2));

        // TreeMap is-a NavigableMap
        NavigableMap<Integer, String> nav = tree;
        System.out.println("A navigable map: " + nav);

        System.out.println("lowerEntry(2) is " + nav.lowerEntry(2));
        System.out.println("lowerKey(2) is " + nav.lowerKey(2));
        System.out.println("floorEntry(2) is " + nav.floorEntry(2));
        System.out.println("floorKey(2) is " + nav.floorKey(2));
    }
}
