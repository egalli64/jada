/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s02;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * The Collection interface
 */
public class CollectionExample {
    public static void main(String[] args) {
        // Any concrete collection object could be assigned to a collection interface
        Collection<Integer> one = List.of(33, 42, 12);
        Collection<Integer> two = new HashSet<>(one);

        /*
         * toString and equals are overridden by concrete collections
         */
        System.out.println("Collection one toString() is " + one);
        System.out.println("Collection two toString() is " + two);

        if (!one.equals(two)) {
            System.out.println("Accordingly to equals(), collection one and two are different");
        } else {
            System.out.println("Unexpected! Collection of different types should be seen as different");
        }

        /*
         * size
         */
        if (one.size() == two.size()) {
            System.out.printf("Collection one and two have both %d as size()\n", one.size());
        } else {
            System.out.println("Unexpected!");
        }

        /*
         * contains, containsAll, isEmpty
         */
        System.out.println("Collection one contains(42)? " + one.contains(42)); // true
        System.out.println("Collection one containsAll(two)? " + one.containsAll(two)); // true
        System.out.println("Collection one isEmpty()? " + one.isEmpty()); // false

        /*
         * add and addAll
         */
        System.out.println("add(18) on collection two succeeded? " + two.add(18)); // true

        Collection<Integer> twoB = new HashSet<>();
        System.out.println("Collection twoB has been created empty: " + twoB);
        System.out.println("Collection twoB has changed after addAll(two)? " + twoB.addAll(two)); // true

        if (two.equals(twoB)) {
            System.out.println("Collection two equals() twoB (same concrete type and same elements)");
        } else {
            System.out.println("Unexpected");
        }

        /*
         * remove and remove all
         */
        System.out.println("remove(18) on collection twoB succeeded? " + twoB.remove(18)); // true
        System.out.println("Collection twoB contains(18)? " + twoB.contains(18)); // false
        System.out.println("Collection twoB has changed after removeAll(two)? " + twoB.removeAll(two)); // true
        System.out.println("Collection twoB isEmpty()? " + twoB.isEmpty()); // true

        /*
         * clear
         */
        two.clear();
        System.out.println("After clear(), collection two is empty? " + two.isEmpty()); // true

        /*
         * toArray
         */
        System.out.print("Collection one as array: ");

        // among the three overload of toArray(), this is usually the preferred one
        Integer[] values = one.toArray(new Integer[0]);

        // same, in two steps
//        Integer[] values = new Integer[0];
//        values = one.toArray(values);

        System.out.println(Arrays.toString(values));

        /*
         * Being iterable, each collection support the for-each statement
         */
        System.out.print("For each element in collection one, print it: ");
        for (Integer cur : one) {
            System.out.print(cur + " ");
        }
        System.out.println();

        /*
         * Unsupported method should throw an UnsupportedOperationException
         */
        try {
            one.remove(42);
            System.out.println("Unexpected! Collection one is unmodifiable");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't remove() from an unmodifiable collection: " + ex);
        }
    }
}
