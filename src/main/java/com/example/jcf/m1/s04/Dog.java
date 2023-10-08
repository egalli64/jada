/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m1.s04;

/**
 * A Comparable record
 */
public record Dog(String name, String owner) implements Comparable<Dog> {
    @Override
    public int compareTo(Dog that) {
        int cmp = this.name.compareTo(that.name);
        if (cmp == 0) {
            return this.owner.compareTo(that.owner);
        }
        return cmp;
    }
}
