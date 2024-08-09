/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.aStatic;

/**
 * Smoke test for static nested classes
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Using a public nested class object: ");
        var nested = new Nesting.PublicStaticNestedClass();
        nested.hello();

        System.out.print("Using a package nested class object: ");
        var pack = new Nesting.PackageStaticNestedClass();
        pack.hello();

        System.out.print("Using a protected nested class object: ");
        var pro = new Nesting.ProtectedStaticNestedClass();
        pro.hello();

        // Won't compile, not visible
//        Nesting.PrivateStaticNestedClass x;

        System.out.print("Calling a method that uses a private nested class object: ");
        Nesting nest = new Nesting();
        nest.hello();
    }
}
