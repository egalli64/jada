/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The Collections class
 */
public class UsingCollections {
    /**
     * Some methods from Collections
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // An unmodifiable list seen as a collection
        Collection<Integer> unmodifiable = List.of(4, 2, 6, 1);

        System.out.println("An unmodifiable collection: " + unmodifiable);
        System.out.println("Its max is " + Collections.max(unmodifiable));
        System.out.println("Its min is " + Collections.min(unmodifiable));

        List<Integer> fixedSize = Arrays.asList(4, 2, 6, 1, 8, 0);
        System.out.println("A fixed size list: " + fixedSize);

        Collections.shuffle(fixedSize);
        System.out.println("After shuffling is " + fixedSize);

        Collections.rotate(fixedSize, 2);
        System.out.println("After rotate 2 is " + fixedSize);
    }
}
