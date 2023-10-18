/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m2.s10;

import java.util.AbstractMap;
import java.util.Map;

/**
 * The Entry interface
 */
public class EntryExample {
    public static void main(String[] args) {
        // An unmodifiable entry
        Map.Entry<Integer, String> entry = Map.entry(1, "one");
        System.out.println("The entry: " + entry);

        System.out.println("getKey() on the entry gives " + entry.getKey());
        System.out.println("getValue() on the entry gives " + entry.getValue());

        try {
            entry.setValue("uno");
        } catch (UnsupportedOperationException ex) {
            System.out.println("setValue() on an unmodifiable entry: " + ex);
        }

        var mutable = new AbstractMap.SimpleEntry<Integer, String>(1, "one");
        System.out.println("A mutable entry: " + mutable);
        System.out.println("Comparing the two entries by equals() gives " + entry.equals(mutable));

        System.out.println("setValue(\"two\") on the mutable entry gives " + mutable.setValue("two"));
    }
}
