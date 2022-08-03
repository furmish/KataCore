package odd_numbers;

public class Solution {
    public static void main(String[] args) {
        printOddNumbers(new int[]{0, 4});
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            if (i % 2 != 0) {
                sb.append(i).append(",");
            }
        }
        if (sb.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
