/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2;

import com.example.jada.m1.s2.bInner.Nesting;

/**
 * Smoke test for static nested classes
 */
public class MainInner {
    public static void main(String[] args) {
        Nesting nesting = new Nesting(42);

        System.out.print("Using a public inner class object: ");
        Nesting.PublicInnerClass nested = nesting.new PublicInnerClass();
        nested.hello();

        // Won't compile, not visible
//        Nesting.PackageInnerClass x;

        // Won't compile, not visible
//        Nesting.PrivateInnerClass x;

        System.out.print("Calling a method that uses a private inner class object: ");
        nesting.hello();
    }
}
