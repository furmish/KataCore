package common;

import java.util.function.UnaryOperator;

public class Solution {

    public static void main(String[] args) {
        System.out.println(sqrt());
    }

    public static UnaryOperator<Integer> sqrt() {
        return (x) -> x * x;
    }
}

