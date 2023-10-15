/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s04;

/**
 * Dog, not meant to be serialized
 */
public class Dog {
    private final String name;

    /**
     * Each dog requires a name
     * 
     * @param name the dog name
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Dog behavior
     */
    public void bark() {
        System.out.println(name + " barks!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
}
