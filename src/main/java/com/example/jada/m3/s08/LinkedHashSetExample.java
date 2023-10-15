/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s08;

import java.util.LinkedHashSet;
import java.util.List;

/**
 * LinkedHashSet
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(List.of(5, 8, 99));
        System.out.println("The set: " + lhs);

        lhs.addFirst(12);
        lhs.addLast(42);
        System.out.println("After adding 12 (first) and 42 (last): " + lhs);

        if (lhs.contains(12)) {
            System.out.println("12 is now in the set");
        }

        if (!lhs.add(12)) {
            System.out.println("No duplicated object in a set!");
        }
        if (!lhs.remove(42)) {
            System.out.println("Can't remove an object that is not in the set");
        }

        System.out.print("Now the set contains: ");
        for (Integer cur : lhs) {
            System.out.print(cur + " ");
        }
        System.out.println();
    }
}
