/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s10.rec;

/**
 * Example for Comparable::compareTo on records
 */
public class MainCompare {
    /**
     * Create two comparable records and compare them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        ComparableDog tomBob = new ComparableDog("Tom", "Bob");
        ComparableDog tomCarl = new ComparableDog("Tom", "Carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }
    }
}
