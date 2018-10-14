package Solved;

import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

    }
}