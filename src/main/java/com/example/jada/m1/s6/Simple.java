/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s6;

import java.util.Objects;

/**
 * A simple JavaBean
 */
public class Simple {
    private String s;

    /**
     * Canonical constructor
     * 
     * @param s the instance value
     */
    public Simple(String s) {
        this.s = s;
    }

    /**
     * No-arg constructor - required
     */
    public Simple() {
    }

    /**
     * Getter - required
     * 
     * @return the instance value
     */
    public String getS() {
        return s;
    }

    /**
     * Setter - required
     * 
     * @param s the instance value
     */
    public void setS(String s) {
        this.s = s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Simple other = (Simple) obj;
        return Objects.equals(s, other.s);
    }

    @Override
    public String toString() {
        return "Simple [s=" + s + "]";
    }
}
