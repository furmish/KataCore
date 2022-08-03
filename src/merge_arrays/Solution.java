package merge_arrays;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2, 4, 5}, new int[]{1,3,9})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] resultArr = new int[a1.length + a2.length];

        while (k < resultArr.length) {
            if (i == a1.length) {
                resultArr[k++] = a2[j++];
            } else if (j == a2.length) {
                resultArr[k++] = a1[i++];
            } else if (a1[i] < a2[j]) {
                resultArr[k++] = a1[i++];
            } else {
                resultArr[k++] = a2[j++];
            }
        }
        return resultArr;
    }
}

