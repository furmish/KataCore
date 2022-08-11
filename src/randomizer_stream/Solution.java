package randomizer_stream;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        pseudoRandomStream(13);
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, operand -> (operand * operand / 10) % 1000);
    }

}
