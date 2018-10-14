package Solved;

import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String[] array = input1.split(" ");
        int iteration = Integer.parseInt(array[0]);
        int answer = Integer.parseInt(array[1]);

        for (int i = 0; i < iteration; i++) {
            String useless = sc.nextLine();
        }

        System.out.println(answer);
    }
}
