/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.aStatic;

/**
 * A class having static nested classes
 */
public class Nesting {
    private static final String MESSAGE = "Hello";

    public static class PublicStaticNestedClass {
        public void hello() {
            System.out.println(MESSAGE + " from a public static nested class");
        }
    }

    static class PackageStaticNestedClass {
        void hello() {
            System.out.println(MESSAGE + " from a package static nested class");
        }
    }

    protected static class ProtectedStaticNestedClass {
        void hello() {
            System.out.println(MESSAGE + " from a protected static nested class");
        }
    }

    private static class PrivateStaticNestedClass {
        private void hello() {
            System.out.println(MESSAGE + " from a private static nested class");
        }
    }

    public void hello() {
        PrivateStaticNestedClass nested = new PrivateStaticNestedClass();
        nested.hello();
    }
}
