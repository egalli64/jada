/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s6;

/**
 * Using a simple record
 */
public class SimpleMain {
    public static void main(String[] args) {
        Simple simple = new Simple("hello");

        System.out.println("Simple bean to string: " + simple);
        System.out.println("Accessing a bean field: " + simple.getS());
        System.out.println("Simple bean hash code: " + simple.hashCode());

        Simple alias = simple;
        System.out.println("Two references to the same bean are equal: " + simple.equals(alias));

        Simple same = new Simple("hello");
        System.out.println("Two different beans are equal if their fields are equal: " + simple.equals(same));

        Simple other = new Simple("goodbye");
        System.out.println("Comparing two different beans: " + simple.equals(other));

        System.out.println("Comparing a bean against null: " + simple.equals(null));

        Simple nullBean = new Simple(null);
        System.out.println("A bean with null in it: " + nullBean);
        System.out.println("Comparing to a bean with null in it: " + nullBean.equals(null));
    }
}
