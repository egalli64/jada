/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m3.s3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional
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
         * isPresent() vs isEmpty()
         */
        for (Optional<Double> opt : opts) {
            if (opt.isPresent()) {
                System.out.println("A present optional: " + opt);
            }

            if (opt.isEmpty()) {
                System.out.println("An empty optional: " + opt);
            }
        }

        /*
         * get(), orElseThrow(), orElse()
         */
        for (Optional<Double> opt : opts) {
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
