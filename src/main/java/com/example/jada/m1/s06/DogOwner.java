/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s06;

import java.io.Serial;
import java.util.Set;

/**
 * A more complex serializable JavaBean
 */
public class DogOwner extends Person {
    @Serial
    private static final long serialVersionUID = 4107673229461141934L;
    private int key;
    private Set<Dog> dogs;

    /**
     * No-arg constructor - required
     */
    public DogOwner() {
        this(0);
    }

    /**
     * An extra constructor
     * 
     * @param key the owner id
     */
    public DogOwner(int key) {
        this.key = key;
    }

    /**
     * Canonical constructor
     * 
     * @param key       the instance id
     * @param firstName person first name
     * @param lastName  person last name
     * @param dogs      composition
     */
    public DogOwner(int key, String firstName, String lastName, Set<Dog> dogs) {
        super(firstName, lastName);
        this.key = key;
        this.dogs = dogs;
    }

    /**
     * Getter - required
     * 
     * @return the id
     */
    public int getKey() {
        return key;
    }

    /**
     * Setter - required
     * 
     * @param key the id
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * Getter - required
     * 
     * @return the dogs
     */
    public Set<Dog> getDogs() {
        return dogs;
    }

    /**
     * Setter - required
     * 
     * @param dogs the dogs
     */
    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dogs == null) ? 0 : dogs.hashCode());
        result = prime * result + key;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        DogOwner other = (DogOwner) obj;
        if (dogs == null) {
            if (other.dogs != null)
                return false;
        } else if (!dogs.equals(other.dogs))
            return false;
        if (key != other.key)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DogOwner [key=" + key + ", " + super.toString() + ", dogs=" + dogs + "]";
    }
}
