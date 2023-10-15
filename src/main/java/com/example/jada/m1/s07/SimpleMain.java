/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s07;

/**
 * Using a simple record
 */
public class SimpleMain {
    public static void main(String[] args) {
        Simple simple = new Simple("hello");

        System.out.println("Simple record to string: " + simple);
        System.out.println("Accessing a record field: " + simple.s());
        System.out.println("Simple record hash code: " + simple.hashCode());

        Simple alias = simple;
        System.out.println("Two references to the same record are equal: " + simple.equals(alias));

        Simple same = new Simple("hello");
        System.out.println("Two different records are equal if their properies are equal: " + simple.equals(same));

        Simple other = new Simple("goodbye");
        System.out.println("Comparing two different records: " + simple.equals(other));

        System.out.println("Comparing a record against null: " + simple.equals(null));

        Simple nullRec = new Simple(null);
        System.out.println("A record with null in it: " + nullRec);
        System.out.println("Comparing to a record with null in it: " + nullRec.equals(null));
    }
}
