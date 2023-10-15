/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s05;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList
 */
public class LinkedListExample {
    /**
     * A few methods from LinkedList
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // an empty linked list
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(3);
        list.addFirst(2);
        System.out.println("First element is " + list.getFirst());
        System.out.println("Last element is " + list.getLast());

        // potentially expensive operations
        list.add(2, 4);
        list.set(2, 99);

        System.out.println("After adding and setting: " + list);

        list = list.reversed();
        System.out.println("After reversing: " + list);

        Integer middle = list.get(list.size() / 2);
        System.out.println("Central(ish) element: " + middle);
        System.out.println("First element was: " + list.removeFirst());

        LinkedList<Integer> copy = new LinkedList<>(list);
        System.out.println("Copied list: " + copy);

        // add ones before each existing elements
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            it.add(1);
            it.next();
        }
        System.out.println("After adding 1 before each element: " + list);

        // remove even elements
        while (it.hasPrevious()) {
            Integer value = it.previous();
            if (value % 2 != 0) {
                it.remove();
            }
        }

        System.out.println("After removing odd elements: " + list);
    }
}
