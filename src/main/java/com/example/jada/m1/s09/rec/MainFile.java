/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s09.rec;

import java.time.LocalDate;
import java.util.Set;

import com.example.jada.m1.s08.Dog;
import com.example.jada.m1.s08.DogOwner;
import com.example.jada.m1.s08.Person;

/**
 * Serialize / Deserialize smoke test
 */
public class MainFile {
    private static final int DEFAULT_KEY = 42;

    /**
     * After serialization is done, deserialize the record stored with the default
     * key
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int key = serialize();

        DogOwner tom = DogAssemblerFile.read(key);
        System.out.println("Deserialized tom: " + tom);
    }

    /**
     * Create a dog owner with a couple of associated dogs, and serialize it to file
     * 
     * @return the serialization key
     */
    private static int serialize() {
        Set<Dog> dogs = Set.of(new Dog("Bob", LocalDate.now()), new Dog("Bix", LocalDate.of(2020, 10, 20)));
        Person tom = new Person("Tom", "Smith");
        DogOwner owner = new DogOwner(DEFAULT_KEY, tom, dogs);

        DogAssemblerFile.save(owner);
        System.out.println("Serializing done");
        return owner.key();
    }
}
