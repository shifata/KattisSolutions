package Solved;

import java.util.Scanner;

public class HelpAPhDCandidateOut {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();

        for (int i = 0; i < iterations; i++) {
            String input = scanner.next();

            if (input.contains("=")) {
                System.out.println("skipped");
            } else {
                String[] array = input.split("\\+");
                int a = Integer.parseInt(array[0]);
                int b = Integer.parseInt(array[1]);
                int sum = a + b;
                System.out.println(sum);
            }
        }
        scanner.close();
    }
}