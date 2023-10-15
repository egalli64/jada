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
 * Collections
 */
public class UsingCollections {
    /**
     * Some methods from Collections
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Collection<Integer> immutable = List.of(4, 2, 6, 1);

        System.out.println("An immutable collection: " + immutable);
        System.out.println("max: " + Collections.max(immutable));
        System.out.println("min: " + Collections.min(immutable));

        List<Integer> mutable = Arrays.asList(4, 2, 6, 1, 8, 0);
        System.out.println("A fixed-size mutable list: " + mutable);

        Collections.shuffle(mutable);
        System.out.println("After shuffling: " + mutable);

        Collections.rotate(mutable, 2);
        System.out.println("After rotate 2: " + mutable);
    }
}
