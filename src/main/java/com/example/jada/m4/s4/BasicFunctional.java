/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m4.s4;

import java.util.List;
import java.util.Optional;

/**
 * Optional
 */
public class BasicFunctional {
    /**
     * Basic optional higher order conditional methods
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Optional<Double>> opts = List.of(Optional.of(42.5), Optional.empty());

        /*
         * ifPresent()
         */
        for (Optional<Double> opt : opts) {
            opt.ifPresent(value -> System.out.println("The optional value (if present) is " + value));
        }

        /*
         * ifPresentOrElse()
         */
        for (Optional<Double> opt : opts) {
            opt.ifPresentOrElse(value -> System.out.println("The optional value (if present) is " + value),
                    () -> System.out.println("An empty optional (or else)"));
        }
    }
}
