/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

/**
 * A dog that could be serialized
 * <p>
 * The associated unit test verify it
 */
public class SerialDog implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private static final String BASE_FILE_NAME = "dog.";

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

    /**
     * Static factory method that read a serial dog from file
     * 
     * @param key dog id
     * @return a new serial dog
     * @throws IllegalStateException in case of failure
     */
    public static SerialDog read(int key) {
        File file = new File(BASE_FILE_NAME + key);
        try (FileInputStream fis = new FileInputStream(file); //
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof SerialDog) {
                return (SerialDog) obj;
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
