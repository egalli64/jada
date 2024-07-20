/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.bInner;

/**
 * Smoke test for tricky non-static nested class
 */
public class TrickyMain {
    public static void main(String[] args) {
        Tricky tricky = new Tricky();

        // Won't compile, not visible
//      Tricky.InnerPrivate x;

        // however, in a way, we can access an inner private class
        TrickyHelper x = tricky.getInner();
        System.out.println("Accessing a Tricky private member: " + x.getValue());

        System.out.println("Same, in a safer way: " + tricky.getInnerValue());
    }
}
