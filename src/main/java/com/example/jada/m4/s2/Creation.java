/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m4.s2;

import java.util.Optional;

/**
 * Optional creation
 */
public class Creation {
    /**
     * Optional static factory methods: of, ofNullable, empty
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        /*
         * Optional::of
         */
        Optional<String> optHello = Optional.of("Hello");
        System.out.println("Make an optional of a string: " + optHello);

        try {
            Optional<String> error = Optional.of(null);
            System.out.println("You won't see this " + error);
        } catch (NullPointerException npe) {
            System.out.println("Can't make an optional of null: " + npe);
        }

        /*
         * Optional::ofNullable
         */
        String[] nullables = { "Something", null };
        for (String nullable : nullables) {
            Optional<String> opt = Optional.ofNullable(nullable);
            System.out.println("Make an optional of a nullable: " + opt);
        }

        /*
         * Optional::empty
         */
        Optional<String> optEmpty = Optional.empty();
        System.out.println("An empty optional string: " + optEmpty);
    }
}
