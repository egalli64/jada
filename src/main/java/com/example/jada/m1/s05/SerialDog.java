/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s05;

import java.io.Serial;
import java.io.Serializable;

/**
 * Dog that could be serialized
 */
public class SerialDog implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private final String name;
    private int barkCount;
    /** should not be serialized */
    private transient int happinessLevel;

    /**
     * Each dog has a name and a happiness level
     * 
     * @param name           the dog name
     * @param happinessLevel the dog happiness level
     */
    public SerialDog(String name, int happinessLevel) {
        this.name = name;
        this.barkCount = 0;
        this.happinessLevel = happinessLevel;
    }

    /**
     * A setter
     * 
     * @param happinessLevel the new happiness level
     */
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    /**
     * A getter
     * 
     * @return the dog name
     */
    public String getName() {
        return name;
    }

    /**
     * Dog behavior
     */
    public void bark() {
        barkCount += 1;
        System.out.printf("%s barks! (%d - %d)%n", name, happinessLevel, barkCount);
    }

    @Override
    public String toString() {
        return "SerialDog [name=" + name + ", barkCount=" + barkCount + ", happinessLevel=" + happinessLevel + "]";
    }
}
