/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.bInner;

/**
 * A class having non-static nested (inner) classes
 */
public class Nesting {
    private static final String MESSAGE = "Hello";
    private final int id;

    public Nesting(int id) {
        this.id = id;
    }

    public class PublicInnerClass {
        public void hello() {
            System.out.println(MESSAGE + " from a public inner class object with id " + id);
        }
    }

    class PackageInnerClass {
        void hello() {
            System.out.println(MESSAGE + " from a package inner class object with id " + id);
        }
    }

    private class PrivateInnerClass {
        private void hello() {
            System.out.println(MESSAGE + " from a private inner class object with id " + id);
        }
    }

    public void hello() {
        PrivateInnerClass nested = new PrivateInnerClass();
        nested.hello();
    }
}
