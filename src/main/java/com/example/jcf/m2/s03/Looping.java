/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s03;

import java.util.Iterator;
import java.util.List;

/**
 * Iterable - Iterator
 */
public class Looping {
    /**
     * Compare using an iterator, the for-each statement, and the forEach() method
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Iterable<Integer> iterable = List.of(1, 3, 4, 2, 42);
        System.out.println("Iterable: " + iterable);

        System.out.print("while-has-next loop: ");
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("for-each loop: ");
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Java 8 Iterable::forEach(): ");
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
