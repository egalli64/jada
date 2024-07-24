/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m4.s3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Access to optional value: check and extraction
 */
public class BasicAccess {
    /**
     * Accessing an Optional value
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Optional<Double>> opts = List.of(Optional.of(42.5), Optional.empty());
        System.out.println("A list of optionals: " + opts + "\n");

        /*
         * Optional::isPresent() vs Optional::isEmpty()
         */
        for (var opt : opts) {
            if (opt.isPresent()) {
                System.out.println("This optional is present: " + opt);
            }

            if (opt.isEmpty()) {
                System.out.println("This optional is empty: " + opt);
            }
        }
        System.out.println();

        /*
         * Optional::get(), Optional::orElseThrow(), Optional::orElse()
         */
        for (var opt : opts) {
            try {
                var value = opt.get();
                System.out.println("The optional value (get) is " + value);
            } catch (NoSuchElementException ex) {
                System.out.println("Can't get (get) value from " + opt);
            }

            try {
                var value = opt.orElseThrow();
                System.out.println("The optional value (orElseThrow) is " + value);
            } catch (NoSuchElementException ex) {
                System.out.println("Can't get (orElseThrow) value from " + opt);
            }

            try {
                var value = opt.orElseThrow(IllegalStateException::new);
                System.out.println("The optional value (orElseThrow an IllegalStateException) is " + value);
            } catch (IllegalStateException ex) {
                System.out.println("Can't get (orElseThrow an IllegalStateException) value from " + opt);
            }

            var value2 = opt.orElse(0.0);
            System.out.println("The optional value or else its fallback: " + value2);
            System.out.println("---");
        }
    }
}
