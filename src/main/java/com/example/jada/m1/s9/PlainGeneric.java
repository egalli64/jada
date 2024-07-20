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
public class PlainGeneric {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        // won't pass the compiler check
//        dogs.add("Checked at compile-time");

        System.out.println(dogs);

        for (int i = 0; i < dogs.size(); i++) {
            // no need of downcast
            System.out.println(dogs.get(i));
        }

        // even better, a for-each statement could be used
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
