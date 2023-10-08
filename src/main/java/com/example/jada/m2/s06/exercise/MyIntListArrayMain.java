/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m2.s06.exercise;

/**
 * TODO: Implement and use a statically sized array based list of integers
 */
public class MyIntListArrayMain {
    /**
     * Smoke test for MyIntList - a JUnit test case would be more helpful!
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        MyIntList mil = new MyIntListArray();

        if (!mil.isEmpty()) {
            System.out.println("Unexpected!");
        }

        mil.add(42);
        System.out.println(mil.toString());
    }
}
