/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m4.s4;

import java.util.List;
import java.util.Optional;

/**
 * Using Optional in functional context
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
        for (var opt : opts) {
            opt.ifPresent(x -> System.out.println("The value (if present) is " + x));
        }
        System.out.println("When using ifPresent, empty value is quietly skipped");

        /*
         * ifPresentOrElse()
         */
        for (var opt : opts) {
            opt.ifPresentOrElse(x -> System.out.println("The value (if present) is " + x),
                    () -> System.out.println("No value (or else)!"));
        }
    }
}
