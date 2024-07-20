/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.cLocal;

/**
 * Smoke test for local class
 */
public class Main {
    public static void main(String[] args) {
        Nesting nesting = new Nesting();

        System.out.print("Calling a method that uses a local class in its body: " + nesting.answer());
    }
}
