/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s04;

/**
 * Can't serialize a wrong serial dog
 */
public class WrongSerialDogMain {
    public static void main(String[] args) {
        WrongSerialDog bob = new WrongSerialDog("Bob");
        bob.save(42);
        System.out.println(bob + " serialized");
    }
}
