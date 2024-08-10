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
 * The SortedMap and NavigableMap interfaces
 */
public class Example1SortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sorted = new TreeMap<>(Map.ofEntries( //
                Map.entry(1, "one"), Map.entry(2, "two"), Map.entry(3, "three")));
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
    }
}
