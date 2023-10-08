/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m2.s10;

import java.util.EnumSet;

/**
 * EnumSet example on the Size enumerator
 */
public class EnumSetExample {
    /**
     * Working with EnumSet
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        EnumSet<Size> allSizes = EnumSet.allOf(Size.class);
        System.out.println("All available sizes: " + allSizes);

        EnumSet<Size> empty = EnumSet.noneOf(Size.class);
        System.out.println("An empty enum set: " + empty);

        EnumSet<Size> couple = EnumSet.of(Size.XS, Size.L);
        System.out.println("A couple of available sizes: " + couple);

        EnumSet<Size> range = EnumSet.range(Size.XS, Size.L);
        System.out.println("A range of available sizes: " + range);

        if (empty.isEmpty()) {
            System.out.println("Add an element to the empty enum set");
            empty.add(Size.M);
            System.out.println("Now is: " + empty);
        }

        if (!empty.isEmpty() && empty.contains(Size.M)) {
            System.out.println("Remove 'M' the the 'empty' set");
            empty.remove(Size.M);
            System.out.println("Now it is really empty, its size is " + empty.size());
        }
    }
}
