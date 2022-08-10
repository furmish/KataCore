package delete_even;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integers = new LinkedList<>();
        int index = 0;
        while (scanner.hasNext()) {
            if (index++ % 2 != 0) {
                integers.addFirst(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        for (Integer i : integers) {
            System.out.printf("%d ", i);
        }
    }
}
