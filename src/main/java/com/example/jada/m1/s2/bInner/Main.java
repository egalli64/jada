/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.bInner;

/**
 * Smoke test for non-static nested classes
 */
public class Main {
    public static void main(String[] args) {
        Nesting nesting = new Nesting(42);

        System.out.print("Using a public inner class object: ");
        Nesting.PublicInnerClass nested = nesting.new PublicInnerClass();
        nested.hello();

        System.out.print("Using a package inner class object: ");
        // Using "var" instead actual class name to improve readability
        var pack = nesting.new PackageInnerClass();
        pack.hello();

        // Won't compile, not visible
//        Nesting.PrivateInnerClass x;

        System.out.print("Calling a method that uses a private inner class object: ");
        nesting.hello();
    }
}
