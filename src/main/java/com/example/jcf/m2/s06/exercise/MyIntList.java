/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m2.s06.exercise;

/**
 * A minimal list interface
 * 
 * @see MyIntListArray
 * @see MyIntListLinked
 */
public interface MyIntList {
    /**
     * Inserts a value as the last (rightmost, tail) element
     * 
     * @param value the integer to insert
     */
    void add(int value);

    /**
     * Get the value in a specified position
     * 
     * @param pos the required position, zero based index
     * @return the value
     * 
     * @throws IllegalArgumentException if case of bad position
     */
    int get(int pos);

    /**
     * Is the list empty?
     * 
     * @return true if the list is empty
     */
    boolean isEmpty();
}
