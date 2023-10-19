/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s10.bean;

import com.example.jada.m1.s10.Cat;

/**
 * Example for Comparable::compareTo on JavaBeans
 */
public class MainCompare {
    /**
     * Create two comparable beans and compare them, see what happens when comparing
     * against an object from another class
     * 
     * @param args not used
     */
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        ComparableDog tomBob = new ComparableDog("Tom", "Bob");
        ComparableDog tomCarl = new ComparableDog("Tom", "Carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }

        Cat bob = new Cat();
        if (tomBob.equals(bob)) {
            System.out.println("Unexpected");
        } else {
            System.out.println("The compiler warns about an unlikely argument (if it is not suppressed)");
        }

        // ComparableDog::compareTo() is not applicable to Cat
//        if (tomBob.compareTo(bob)) {
//
//        }

    }
}
