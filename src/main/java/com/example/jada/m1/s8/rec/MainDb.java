/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s8.rec;

import java.time.LocalDate;
import java.util.Set;

import com.example.jada.m1.s7.Dog;
import com.example.jada.m1.s7.DogOwner;
import com.example.jada.m1.s7.Person;

/**
 * Serialize / Deserialize on H2 DB smoke test
 */
public class MainDb {
    /**
     * After serialization is done, deserialize the record stored with the default
     * key
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int pid = create();
        System.out.println("Person has id " + pid);

        DogOwner tom = read(pid);
        System.out.println("Tom: " + tom);
    }

    private static DogOwner read(int pid) {
        return DogAssemblerDb.read(pid);
    }

    /**
     * Create a dog owner with a couple of associated dogs, and serialize it to H2
     * 
     * @return the owner key, generated by H2
     */
    private static int create() {
        Set<Dog> dogs = Set.of(new Dog("Bob", LocalDate.now()), new Dog("Bix", LocalDate.of(2020, 10, 20)));
        DogOwner tom = new DogOwner(new Person("Tom", "Smith"), dogs);
        System.out.println("Saving " + tom);

        return DogAssemblerDb.save(tom);
    }
}
