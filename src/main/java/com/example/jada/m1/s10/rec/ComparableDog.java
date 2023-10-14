/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s10.rec;

/**
 * A Comparable record
 */
public record ComparableDog(String name, String owner) implements Comparable<ComparableDog> {
    @Override
    public int compareTo(ComparableDog that) {
        int cmp = this.name.compareTo(that.name);
        if (cmp == 0) {
            return this.owner.compareTo(that.owner);
        }
        return cmp;
    }
}
