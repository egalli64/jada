/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s07;

/**
 * A simple record
 */
record Simple(String s) {
}

// this won't compile, records are final!
//record Wrong(int value) extends Simple {
//}
