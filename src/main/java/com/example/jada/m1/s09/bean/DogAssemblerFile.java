/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s09.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.jada.m1.s07.DogOwner;

public class DogAssemblerFile {
    private static final String BASE_FILE_NAME = "dogs.";

    public static DogOwner read(int key) {
        File dump = new File(BASE_FILE_NAME + key);
        try (FileInputStream fis = new FileInputStream(dump); //
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof DogOwner) {
                return (DogOwner) obj;
            } else {
                throw new IllegalStateException("Bad object type, " + obj.getClass().getCanonicalName());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalStateException("Can't get owner / dogs for key " + key, e);
        }
    }

    public static void save(DogOwner owner) {
        File dump = new File(BASE_FILE_NAME + owner.getKey());
        try (FileOutputStream fos = new FileOutputStream(dump); //
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(owner);
        } catch (IOException e) {
            throw new IllegalStateException("Can't save owner / dogs for key " + owner.getKey(), e);
        }
    }
}
