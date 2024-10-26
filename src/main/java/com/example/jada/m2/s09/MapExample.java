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
        var temp = Map.ofEntries( //
                Map.entry(51, "fifty-one"), //
                Map.entry(23, "twenty-three"), //
                Map.entry(32, "thirty-two"));

        // Generate a modifiable HashMap from the unmodifiable one, then see it as a map
        Map<Integer, String> map = new HashMap<>(temp);
        System.out.println("A map: " + map);

        /*
         * Calling getters on two keys (existing vs missing)
         */
        for (int key = 32; key <= 33; key++) {
            System.out.printf("get(%d) is %s\n", key, map.get(key));
            System.out.printf("getOrDefault(%d) is %s\n", key, map.getOrDefault(key, "Missing"));
        }

        /**
         * Calling inserter on two keys (existing vs missing)
         */
        for (int key = 32; key <= 33; key++) {
            final String value = "thirty-three";
            System.out.printf("putIfAbsent(%d, %s) returns %s\n", key, value, map.putIfAbsent(key, value));
        }
        System.out.println("Now the map is " + map);

        /**
         * Calling setter on two keys (existing vs missing)
         */
        for (int key = 33; key <= 34; key++) {
            final String value = "dreiunddreißig";
            System.out.printf("replace(%d, %s) returns %s\n", key, value, map.replace(key, value));
        }
        System.out.println("Now the map is " + map);

        for (int key = 33; key <= 34; key++) {
            final String old = "dreiunddreißig";
            final String value = "thirty-three";
            System.out.printf("replace(%d, %s, %b) returns %s\n", key, old, value, map.replace(key, old, value));
        }
        System.out.println("Now the map is " + map);
    }
}
