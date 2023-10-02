/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s06.exercise;

/**
 * TODO: Implement and use a single linked list of integers
 */
public class MyIntListLinkedMain {
    /**
     * Smoke test for MyIntListLinked - a JUnit test case would be more helpful!
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        MyIntListLinked mil = new MyIntListLinked();

        if (!mil.isEmpty()) {
            System.out.println("Unexpected!");
        }

        mil.add(42);
        System.out.println(mil.toString());
    }
}
