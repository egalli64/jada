/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s7;

/**
 * A simple record
 */
public record ASimple(String s) {
}

// this won't compile, records are final!
//public record Wrong(int value) extends Simple {
//}
