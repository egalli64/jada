/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s07.bean;

import java.util.Objects;

/**
 * A Comparable JavaBean
 */
public class ComparableDog implements Comparable<ComparableDog> {
    private String name;
    private String owner;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param owner dog owner
     */
    public ComparableDog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Getter
     * 
     * @return dog name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * 
     * @param name new dog name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return dog owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter
     * 
     * @param owner new dog owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        // or use IDE auto-generation tool
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComparableDog)) {
            return false;
        }

        ComparableDog that = (ComparableDog) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        // consider using an external library for better performance
        // or use IDE auto-generation tool
        // or extract code from Arrays.hashCode()
        return Objects.hash(name, owner);
    }

    @Override
    public int compareTo(ComparableDog that) {
        int cmp = this.name.compareTo(that.name);
        if (cmp == 0) {
            return this.owner.compareTo(that.owner);
        }
        return cmp;
    }

    @Override
    public String toString() {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }
}
