package pair_generik;


import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }
    public static class Pair<X, Y> {
        private final X value1;
        private final Y value2;

        private Pair(X value1, Y value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public static <X, Y> Pair<X, Y> of(X value1, Y value2) {
            return new Pair<>(value1, value2);
        }

        public X getFirst() {
            return value1;
        }

        public Y getSecond() {
            return value2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value1, value2);
        }
    }
}
