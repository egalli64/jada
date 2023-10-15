/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s07;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A serializable record
 */
public record Dog(String name, LocalDate birth) implements Serializable {
    /**
     * custom no-arg constructor
     */
    public Dog() {
        this("Unknown", LocalDate.now());
    }

    /**
     * custom canonical constructor in compact form - parameters are deducted
     * 
     * @param name  dog name
     * @param birth dog birthday
     */
    public Dog {
        if (name == null || birth == null) {
            throw new IllegalArgumentException("No null, please!");
        }
    }

    /**
     * Optional static method
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("Dog name: " + dog.name());
        System.out.println("Dog birth: " + dog.birth());
        System.out.println("Dog: " + dog);

        try {
            Dog x = new Dog(null, null);
            System.out.println("Dog name: " + x.name());
            System.out.println("Dog birth: " + x.birth());
            System.out.println("Dog: " + dog);
        } catch (IllegalArgumentException iae) {
            System.out.println("Check on Dog data members, " + iae);
        }
    }
}
