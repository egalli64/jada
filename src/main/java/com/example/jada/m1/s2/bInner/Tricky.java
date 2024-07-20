/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s2.bInner;

/**
 * A tricky inner class example
 */
public class Tricky {
    /**
     * A private inner class
     */
    private class InnerPrivate implements TrickyHelper {
        @Override
        public int getValue() {
            return value;
        }
    }

    private final int value = 42;

    /**
     * Dubious: let us access internal class details
     * 
     * @return an instance of an inner private class!
     */
    public InnerPrivate getInner() {
        return new InnerPrivate();
    }

    /**
     * Safer: internal details are managed here, the result is just a copy
     */
    public int getInnerValue() {
        InnerPrivate inner = new InnerPrivate();
        return inner.getValue();
    }
}
