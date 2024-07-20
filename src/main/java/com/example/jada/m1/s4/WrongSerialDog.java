/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

/**
 * A wrong serial dog
 * <p>
 * The associated unit test verify it can't be serialized
 */
public class WrongSerialDog implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private static final String BASE_FILE_NAME = "wrongDog.";

    private final String name;
    /** this field is _not_ meant for serialization */
    private Tail tail;

    public WrongSerialDog(String name) {
        this.name = name;
        this.tail = new Tail();
    }

    public void bark() {
        System.out.println(name + " barks!");
    }

    public void wag() {
        tail.wag();
    }

    /**
     * Static factory method that read a serial dog from file
     * 
     * @param key dog id
     * @return a new serial dog
     * @throws IllegalStateException in case of failure
     */
    public static WrongSerialDog read(int key) {
        File file = new File(BASE_FILE_NAME + key);
        try (FileInputStream fis = new FileInputStream(file); //
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof WrongSerialDog) {
                return (WrongSerialDog) obj;
            } else {
                throw new IllegalStateException("Bad object type, " + obj.getClass().getCanonicalName());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalStateException("Can't get dog for key " + key, e);
        }
    }

    /**
     * Serialize this dog
     * 
     * @param key the dog id for serialization
     */
    public void save(int key) {
        File file = new File(BASE_FILE_NAME + key);
        try (FileOutputStream fos = new FileOutputStream(file); //
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this);
        } catch (IOException e) {
            throw new IllegalStateException("Can't save dog with key " + key, e);
        }
    }
}
