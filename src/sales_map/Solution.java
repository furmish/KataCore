package sales_map;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSalesMap(new InputStreamReader(System.in)));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new HashMap<>();
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            salesMap.merge(sc.next(), Long.parseLong(sc.next()), Long::sum);
        }
        return salesMap;
    }
}
