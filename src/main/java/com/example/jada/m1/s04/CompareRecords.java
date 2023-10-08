/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m1.s04;

/**
 * Example for Comparable::compareTo on records
 */
public class CompareRecords {
    /**
     * Create two comparable records and compare them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog tomBob = new Dog("Tom", "Bob");
        Dog tomCarl = new Dog("Tom", "Carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }
    }
}
