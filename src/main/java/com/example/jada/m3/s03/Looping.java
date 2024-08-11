/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s03;

import java.util.Iterator;
import java.util.List;

/**
 * Looping using Iterator (explicitly or implicitly)
 */
public class Looping {
    /**
     * Compare using an iterator, the for-each statement, and the forEach() method
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // An unmodifiable list seen as an iterable
        Iterable<Integer> iterable = List.of(1, 3, 4, 2, 42);
        System.out.println("Iterable: " + iterable);

        System.out.print("While-has-next loop: ");
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Looping by for-each statement: ");
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("FP - looping by forEach() method: ");
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
