/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2;

import com.example.jada.m1.s2.aStatic.Nesting;

/**
 * Smoke test for static nested classes
 */
public class MainStaticNested {
    public static void main(String[] args) {
        System.out.print("Using a public nested class object: ");
        var nested = new Nesting.PublicStaticNestedClass();
        nested.hello();

        // Won't compile, not visible
//        Nesting.PackageStaticNestedClass x;

        // Won't compile, not visible
//        Nesting.PrivateStaticNestedClass x;

        System.out.print("Calling a method that uses a private nested class object: ");
        Nesting nest = new Nesting();
        nest.hello();
    }
}
