package deserialization;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Predicate;

public class Solution {
    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(3);
        objectOutputStream.writeObject(new Animal("Fox"));
        objectOutputStream.writeObject(new Animal("Wolf"));
        objectOutputStream.writeObject(new Animal("Dog"));
        objectOutputStream.close();
        System.out.println(Arrays.toString(deserializeAnimalArray(byteArrayOutputStream.toByteArray())));




    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = ois.readInt();
            Animal[] array = new Animal[size];
            for (int i = 0; i < size; i++) {
                Animal o = (Animal) ois.readObject();
                array[i] = o;
            }
            return array;
        } catch (IOException | ClassNotFoundException | RuntimeException e) {
            throw new IllegalArgumentException();
        }
    }
}
