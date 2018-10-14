package Solved;

import java.util.Scanner;

public class Aaah {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().toLowerCase();
        String input2 = scanner.nextLine().toLowerCase();
        String[] in1 = input1.split("");
        String[] in2 = input2.split("");
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < in1.length; i++) {
            if (in1[i].contains("a")) {
                c1++;
            }
        }

        for (int i = 0; i < in2.length; i++) {
            if (in2[i].contains("a") && in2[in2.length - 1].equals("h")) {
                c2++;
            }
        }

        if (c1 >= c2) {
            System.out.println("go");
        } else if (c2 >= c1) {
            System.out.println("no");
        } else {

        }

    }
}
