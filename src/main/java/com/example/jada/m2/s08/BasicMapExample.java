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
        // A hash map
        HashMap<Integer, String> hash = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));

        // HashMap is-a Map
        Map<Integer, String> map = hash;
        System.out.println("A map: " + map);

        /*
         * Views on Map
         */
        System.out.println("The map keySet() is " + map.keySet());
        System.out.println("The map values() is " + map.values());
        System.out.println("The map entrySet() is " + map.entrySet());

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
