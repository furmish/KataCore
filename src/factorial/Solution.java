package factorial;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static BigInteger factorial(int value) {
    BigInteger result = new BigInteger(String.valueOf(value));
    return value <= 1 ? BigInteger.ONE : result.multiply(factorial(--value));
    }
}
