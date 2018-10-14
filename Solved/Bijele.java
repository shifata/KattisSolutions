package Solved;

import java.util.Scanner;

public class Bijele {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] input = {1, 1, 2, 2, 2, 8};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = input[i] - scanner.nextInt();
        }

        for (int j = 0; j < output.length; j++) {
            System.out.print(output[j] + " ");
        }
    }
}
