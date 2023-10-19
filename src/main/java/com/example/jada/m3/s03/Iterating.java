/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s03;

import java.util.ArrayList;
import java.util.Arrays;
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
        // A simple way to create a short unmodifiable list
        Collection<Integer> unmodifiable = List.of(3, 6, 1, 9, 2);

        // Each concrete collection has a nice toString() override
        System.out.println("An unmodifiable collection: " + unmodifiable);

        Iterator<Integer> itUm = unmodifiable.iterator();
        if (itUm.hasNext()) {
            System.out.println("The next (actually, first) element is: " + itUm.next());
            try {
                itUm.remove();
            } catch (UnsupportedOperationException ex) {
                System.out.println("Can't remove an item on an unmodifiable collection: " + ex);
            }
        }

        // A collection that can't change size, but whose elements can change
        Collection<Integer> fixedSize = Arrays.asList(3, 6, 1, 9, 2);
        System.out.println("An fixed size collection: " + unmodifiable);

        Iterator<Integer> itFs = fixedSize.iterator();
        if (itFs.hasNext()) {
            System.out.println("The next (actually, first) element is: " + itFs.next());
            try {
                itFs.remove();
            } catch (UnsupportedOperationException ex) {
                System.out.println("Can't remove an item on a fixed size collection: " + ex);
            }
        }

        /*
         * Use an unmodifiable collection to create a mutable list of integer, then
         * store the reference to the latter as a collection
         */
        Collection<Integer> modifiable = new ArrayList<>(unmodifiable);
        System.out.println("A fully modifiable collection: " + modifiable);

        // remove even values
        Iterator<Integer> it = modifiable.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("Only odd values survived: " + modifiable);
    }
}
