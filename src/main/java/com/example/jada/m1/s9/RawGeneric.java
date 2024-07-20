/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s9;

import java.util.ArrayList;
import java.util.List;

/**
 * Anti-pattern: do not use raw generic
 */
public class RawGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add("No check at compile-time");
        dogs.add(42);

        System.out.println(dogs);

        // could (would) crash with ClassCastException at runtime!
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = (Dog) dogs.get(i);
            System.out.println(dog);
        }
    }
}
