/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m3.s04;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class ArrayListExample {
    /**
     * A few methods from ArrayList
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        System.out.println("An empty list: " + list0);

        List<Integer> list1 = new ArrayList<Integer>(5);
        System.out.println("An empty list w/ given (5) capacity: " + list1);

        // adding an element in the last position
        list1.add(56);
        // adding an element in the first position
        list1.add(0, 18);
        list1.add(42);
        System.out.println("After adding elements: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println("A list by copy constructor: " + list2);

        Integer value = list2.get(0);
        System.out.println("Value at the beginning: " + value);

        // calculate the index of the last element
        int lastPos = list2.size() - 1;
        // change its value
        list2.set(lastPos, 11);

        // removing the element in second position
        list2.remove(1);

        System.out.println("After changing the last element and removing the middle one: " + list2);
    }
}
