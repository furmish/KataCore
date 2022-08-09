package symmetric_difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(0, 1, 2));
        Set<Integer> set = symmetricDifference(set1, set2);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> tempSet1 = new HashSet<>(set1);
        Set<T> tempSet2 = new HashSet<>(set2);
        tempSet1.removeAll(set2);
        tempSet2.removeAll(set1);
        tempSet1.addAll(tempSet2);
        return tempSet1;
    }
}
