/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s09;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class TreeSetWithComparator {
    /**
     * Using TreeSet functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> data = List.of(5, 8, 99);

        class MyIntComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer x, Integer y) {
                return Integer.compare(x, y);
            }
        }

        MyIntComparator mic = new MyIntComparator();

        Set<Integer> set = new TreeSet<>(mic);
        set.addAll(data);
        System.out.println("A tree initialized with a comparator (same as default): " + set);

        Set<Integer> setRev = new TreeSet<>(mic.reversed());
        setRev.addAll(data);
        System.out.println("A tree initialized with a reversed comparator: " + setRev);

        SortedSet<Integer> setRev2 = new TreeSet<>((x, y) -> y.compareTo(x));
        setRev2.addAll(data);
        System.out.println("A tree initialized with a lambda reversed comparator: " + setRev2);

        Set<Integer> setRev3 = new TreeSet<>(setRev);
        System.out.println("A tree initialized by standard copy ctor: " + setRev3);

        Set<Integer> setRev4 = new TreeSet<>(setRev2);
        System.out.println("A tree initialized by copy ctor for SortedSet: " + setRev4);
    }
}
