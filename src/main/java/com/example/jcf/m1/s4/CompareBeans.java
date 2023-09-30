/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m1.s4;

/**
 * Example for Comparable::compareTo on JavaBeans
 */
public class CompareBeans {
    /**
     * Create two comparable beans and compare them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        DogBean tomBob = new DogBean("Tom", "Bob");
        DogBean tomCarl = new DogBean("Tom", "Carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }
    }
}
