/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s09;

import java.util.HashMap;
import java.util.Map;

/**
 * The Map interface - other methods
 */
public class MapExample {
    public static void main(String[] args) {
        // An unmodifiable map built from unmodifiable entries
        Map<Integer, String> temp = Map.ofEntries( //
                Map.entry(1, "one"), //
                Map.entry(2, "two"), //
                Map.entry(3, "three"));

        // A (modifiable) hash map
        HashMap<Integer, String> hash = new HashMap<>(temp);

        // HashMap is-a Map
        Map<Integer, String> map = hash;
        System.out.println("A map: " + map);

        /*
         * Getters
         */
        for (int key = 3; key < 5; key++) {
            System.out.printf("get(%d) is %s%n", key, map.get(key));
            System.out.printf("getOrDefault(%d) is %s%n", key, map.getOrDefault(key, "Missing"));
        }

        /**
         * Inserter
         */
        for (int key = 3; key < 5; key++) {
            final String value = "four";
            System.out.printf("putIfAbsent(%d, %s) returns %s%n", key, value, //
                    map.putIfAbsent(key, value));
        }
        System.out.println("Now the map is " + map);

        /**
         * Setters
         */
        for (int key = 4; key < 6; key++) {
            final String value = "vier";
            System.out.printf("replace(%d, %s) returns %s%n", key, value, //
                    map.replace(key, value));
        }
        System.out.println("Now the map is " + map);

        for (int key = 3; key < 5; key++) {
            final String old = "vier";
            final String value = "four";
            System.out.printf("replace(%d, %s, %b) returns %s%n", key, old, value, //
                    map.replace(key, old, value));
        }
        System.out.println("Now the map is " + map);
    }
}
