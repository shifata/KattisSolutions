package Solved;

import java.util.Scanner;

public class Tarifa {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int iterations = scanner.nextInt();
        int output = 0;

        for (int i = 0; i < iterations; i++) {
            int usage = scanner.nextInt();
            output += limit - usage;
        }

        System.out.println(output + limit);
    }
}
