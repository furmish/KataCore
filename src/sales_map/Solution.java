package sales_map;

import java.io.BufferedReader;
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
        try (reader;
             Scanner sc = new Scanner(reader)) {
            while (sc.hasNext()) {
                salesMap.merge(sc.next(), Long.parseLong(sc.next()), Long::sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return salesMap;
    }
}
