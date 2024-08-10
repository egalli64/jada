/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s08;

import java.util.HashMap;
import java.util.Map;

/**
 * The Map interface - basic behavior
 */
public class BasicMapExample {
    public static void main(String[] args) {
        // Use an unmodifiable map to create a HashMap, seen as a Map
        Map<Integer, String> map = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));
        System.out.println("A map: " + map);

        /*
         * Views on Map
         */
        System.out.println("View on the map keys: " + map.keySet());
        System.out.println("View on the map values: " + map.values());
        System.out.println("View on the map entries: " + map.entrySet());

        /**
         * Collection-like methods
         */
        System.out.println("The map size() is " + map.size());
        System.out.println("isEmpty()? " + map.isEmpty());
        System.out.println("containsKey(42)? " + map.containsKey(42));
        System.out.println("containsValue(\"two\")? " + map.containsValue("two"));

        for (int i = 0; i < 2; i++) {
            String prev = map.put(10, "ten");
            System.out.println("put(10, \"ten\"), previous value was " + prev);
        }

        for (int i = 0; i < 2; i++) {
            String removed = map.remove(1);
            System.out.println("remove(1), value for the removed entry was " + removed);
        }

        System.out.println("remove(2, \"two\"), succeeded? " + map.remove(2, "two"));

        map.clear();
        System.out.println("After clear() map is " + map);
    }
}
