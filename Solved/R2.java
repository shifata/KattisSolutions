package Solved;

import java.util.Scanner;

public class R2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int average = scanner.nextInt();
        int output = (2 * average) - r1;
        scanner.close();
        System.out.println(output);

    }
}