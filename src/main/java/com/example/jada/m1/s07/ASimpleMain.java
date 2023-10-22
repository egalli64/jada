/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s07;

/**
 * Using a simple record
 */
public class ASimpleMain {
    public static void main(String[] args) {
        ASimple simple = new ASimple("hello");

        System.out.println("Simple record to string: " + simple);
        System.out.println("Accessing a record field: " + simple.s());
        System.out.println("Simple record hash code: " + simple.hashCode());

        ASimple alias = simple;
        System.out.println("Two references to the same record are equal: " + simple.equals(alias));

        ASimple same = new ASimple("hello");
        System.out.println("Two different records are equal if their properies are equal: " + simple.equals(same));

        ASimple other = new ASimple("goodbye");
        System.out.println("Comparing two different records: " + simple.equals(other));

        System.out.println("Comparing a record against null: " + simple.equals(null));

        ASimple nullRec = new ASimple(null);
        System.out.println("A record with null in it: " + nullRec);
        System.out.println("Comparing to a record with null in it: " + nullRec.equals(null));
    }
}
