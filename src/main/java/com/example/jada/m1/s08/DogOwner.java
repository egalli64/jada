/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s08;

import java.io.Serializable;
import java.util.Set;

/**
 * A more complex serializable record - by composition
 */
public record DogOwner(int key, Person person, Set<Dog> dogs) implements Serializable {
}
