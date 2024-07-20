/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.cLocal;

/**
 * A class having a local class
 */
public class Nesting {
    public int answer() {
        class LocalClass {
            private final int a = 7;
            private final int b = 3;
            private final int c = 2;
        }

        LocalClass answer = new LocalClass();
        return answer.a * answer.b * answer.c;
    }
}
