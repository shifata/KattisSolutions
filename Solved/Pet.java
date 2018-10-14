package Solved;

import java.util.Scanner;

public class Pet {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] sum = new int[5];
        int[][] input = new int[5][4];
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < input.length; i++) {
            int summation = 0;
            for (int j = 0; j < input[i].length; j++) {
                summation += input[i][j];
            }
            sum[i] = summation;
        }

        if (sum[0] > sum[1]) {
            maxSum = sum[0];
            index = 1;
        } else {
            maxSum = sum[1];
            index = 2;
        }

        for (int i = 2; i < sum.length; i++) {
            if (sum[i] > maxSum) {
                maxSum = sum[i];
                index = i + 1;
            }
        }

        System.out.println(index + " " + maxSum);
    }
}