/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s04;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.jupiter.api.Test;

/**
 * Ensure that a non-serializable class won't be serialized
 */
class DogTest {
    @Test
    void negative() {
        Dog tom = new Dog("Tom");

        try (OutputStream os = new ByteArrayOutputStream(); //
                ObjectOutputStream oss = new ObjectOutputStream(os)) {
            assertThrows(NotSerializableException.class, () -> oss.writeObject(tom));
        } catch (IOException e) {
            fail("Can't work with stream", e);
        }
    }
}
