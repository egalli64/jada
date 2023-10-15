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

        /*
         * Optional::isPresent() vs Optional::isEmpty()
         */
        for (var opt : opts) {
            if (opt.isPresent()) {
                System.out.println("A present optional: " + opt);
            }

            if (opt.isEmpty()) {
                System.out.println("An empty optional: " + opt);
            }
        }

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

            var value2 = opt.orElse(0.0);
            System.out.println("The optional value or its fallback is " + value2);
        }
    }
}
