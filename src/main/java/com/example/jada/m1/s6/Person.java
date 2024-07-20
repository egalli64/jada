/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s6;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * A serializable JavaBean
 */
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -8427791639295418080L;
    private String firstName;
    private String lastName;

    /**
     * No-arg constructor - required
     */
    public Person() {
    }

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param birth dog birthday
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getter - required
     * 
     * @return the person first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter - required
     * 
     * @param firstName the person first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter - required
     * 
     * @return the person last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter - required
     * 
     * @param lastName the person last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
