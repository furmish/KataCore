package dynamic_array;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.remove(10);
        array.remove(0);
        System.out.println(array.get(0));
    }
    public static class DynamicArray<T> {
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] array;
        private int size;
        public DynamicArray() {
            this.array = new Object[DEFAULT_CAPACITY];
        }
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) array[index];
        }

        public void add(T el) {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length + 1);
            }
            array[size] = el;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            final int newSize;
            if ((newSize = size - 1) > index) {
                System.arraycopy(array, index + 1, array, index, newSize - index);
            }
            array[size = newSize] = null;
        }
    }
}
