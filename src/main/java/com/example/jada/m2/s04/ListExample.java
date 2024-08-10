/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * The List interface
 */
public class ListExample {
    public static void main(String[] args) {
        // ArrayList is-a List
        List<Integer> list = new ArrayList<>(List.of(12, 18, 31, 26, 51));
        System.out.println("Values in list: " + list);

        /*
         * Index based get
         */

        // Compare this to the array notation: array[2];
        System.out.println("get(2): " + list.get(2));

        try {
            list.get(-3);
            System.out.println("Unexpected! Can't get the value of an element passing a bad index");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("get(-3) causes " + ex);
        }

        /*
         * Index based set
         */

        // Compare this to the array notation: array[1] = 42;
        System.out.println("set(1, 42) gives back the previous value: " + list.set(1, 42));

        try {
            list.set(23, 0);
            System.out.println("Unexpected! Can't set the value of an element passing a bad index");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("set(23, 0) causes " + ex);
        }

        /*
         * Index based add
         */

        list.add(list.size(), 86);
        System.out.println("add(list.size(), 86) works fine, index should be in [0, size()]");

        try {
            list.add(list.size() + 1, 99);
            System.out.println("Unexpected! Can't add an element creating an 'hole' in a list");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("add(list.size() + 1, 99) causes " + ex);
        }

        /*
         * Index based remove
         */

        System.out.println("remove(3) gives back the previous value: " + list.remove(3));

        /*
         * listIterator
         */

        System.out.println("Now the list is " + list);

        System.out.print("Use a listIterator() to drop even values and double the other ones: ");
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current % 2 == 0) {
                it.remove();
            } else {
                it.set(current * 2);
            }
        }
        System.out.println(list);
    }
}
