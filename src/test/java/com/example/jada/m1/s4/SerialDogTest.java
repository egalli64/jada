/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.s4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.junit.jupiter.api.Test;

class SerialDogTest {
    @Test
    void givenSerializableDogWhenSerialize() {
        SerialDog tom = new SerialDog("Tom", 42);

        try (OutputStream os = new ByteArrayOutputStream(); //
                ObjectOutputStream oss = new ObjectOutputStream(os)) {
            oss.writeObject(tom);
            oss.flush();

            String serializedDog = os.toString();
            assertThat(serializedDog).contains(SerialDog.class.getCanonicalName());
            assertThat(serializedDog).endsWith("Tom");
        } catch (IOException e) {
            fail("Something went wrong", e);
        }
    }

    @Test
    void givenSerializableDogWhenDeserialize() {
        String name = "Tom";

        try (PipedOutputStream pos = new PipedOutputStream();
                PipedInputStream is = new PipedInputStream(pos);
                ObjectOutputStream oss = new ObjectOutputStream(pos);
                ObjectInputStream ois = new ObjectInputStream(is)) {
            // push a dog in the stream, given its serialization works fine
            oss.writeObject(new SerialDog(name, 42));
            oss.flush();

            // the actual test
            Object obj = ois.readObject();
            assertThat(obj).isInstanceOf(SerialDog.class);

            SerialDog tom = (SerialDog) obj;
            assertThat(tom.getName()).isEqualTo(name);
        } catch (IOException | ClassNotFoundException e) {
            fail("Something went wrong", e);
        }
    }
}
