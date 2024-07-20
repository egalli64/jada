/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.dAnonymous;

/**
 * Smoke test for an anonymous inner class
 */
public class Main {
    public static void main(String[] args) {
        Helper anonymous = new Helper() {
            @Override
            public int getValue() {
                return 42;
            }
        };

        System.out.print("Calling a method from an anonymous inner class: " + anonymous.getValue());
    }
}
