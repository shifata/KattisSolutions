package Solved;

import java.util.Scanner;

public class Oddities {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;

        for (int i = 0; i < a; i++) {
            b = scanner.nextInt();
            if (b % 2 == 0) {
                System.out.println(b + " is even");
            } else {
                System.out.println(b + " is odd");
            }

        }

    }
}