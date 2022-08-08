package parse_double_from_console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double sum = 0;
        while (scn.hasNext()) {
            if (scn.hasNextDouble()) {
                sum += scn.nextDouble();
            } else {
                scn.next();
            }
        }
        System.out.printf("%.6f", sum);
    }
}
