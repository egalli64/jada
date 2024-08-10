/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s12;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * The SortedMap and NavigableMap interfaces
 */
public class Example2NavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> nav = new TreeMap<>(Map.ofEntries( //
                Map.entry(1, "one"), Map.entry(2, "two"), Map.entry(3, "three")));
        System.out.println("A navigable map: " + nav);

        System.out.println("lowerEntry(2) is " + nav.lowerEntry(2));
        System.out.println("lowerKey(2) is " + nav.lowerKey(2));
        System.out.println("floorEntry(2) is " + nav.floorEntry(2));
        System.out.println("floorKey(2) is " + nav.floorKey(2));
    }
}
