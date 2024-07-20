/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s4;

/**
 * Serialize and deserialize a dog
 */
public class SerialDogMain {
    public static void main(String[] args) {
        SerialDog bob = new SerialDog("Bob", 12);
        bob.bark();
        bob.save(42);
        System.out.println(bob + " serialized");

        SerialDog bob2 = SerialDog.read(42);
        System.out.println("Deserialized bob: " + bob2);
    }
}
