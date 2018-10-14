package Solved;

import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < iterations; i++) {
            int input = scanner.nextInt();

            if (input < 0) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}