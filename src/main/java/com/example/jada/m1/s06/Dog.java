/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s06;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A serializable JavaBean
 */
public class Dog implements Serializable {
    @Serial
    private static final long serialVersionUID = 2382613782351318972L;
    private String name;
    private LocalDate birth;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param birth dog birthday
     */
    public Dog(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    /**
     * No-arg constructor - required
     */
    public Dog() {
    }

    /**
     * Getter - required
     * 
     * @return the dog name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter - required
     * 
     * @param name the dog name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter - required
     * 
     * @return the dog birthday
     */
    public LocalDate getBirth() {
        return birth;
    }

    /**
     * Setter - required
     * 
     * @param birth the dog borthday
     */
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (birth == null) {
            if (other.birth != null)
                return false;
        } else if (!birth.equals(other.birth))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", birth=" + birth + "]";
    }
}
