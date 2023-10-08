/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m2.s03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Iterable - Iterator
 */
public class Iterating {
    /**
     * Iterating on a collection
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Collection<Integer> immutableColl = List.of(3, 6, 1, 9, 2);

        // Each concrete collection has a nice toString() override
        System.out.println("An immutable collection: " + immutableColl);

        Iterator<Integer> itIm = immutableColl.iterator();
        if (itIm.hasNext()) {
            System.out.println("The next (actually, first) element is: " + itIm.next());
            try {
                itIm.remove();
            } catch (UnsupportedOperationException ex) {
                System.out.println("Can't remove an item on an immutable collection: " + ex);
            }
        }

        /*
         * Use an immutable collection to create a mutable list of integer, then store
         * the reference to the latter as a collection
         */
        Collection<Integer> mutableColl = new ArrayList<>(immutableColl);
        System.out.println("A mutable collection: " + mutableColl);

        // remove even values
        Iterator<Integer> it = mutableColl.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("Only odd values survived: " + mutableColl);
    }
}
