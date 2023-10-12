/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s08;

import java.io.Serializable;

/**
 * A serializable record
 */
public record Person(String firstName, String lastName) implements Serializable {
}
