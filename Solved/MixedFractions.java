package Solved;

import java.util.Scanner;

public class MixedFractions {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String output = "";
        boolean run = true;

        for (int i = 0; i < Integer.MAX_VALUE && run; i++) {

            String input = sc.nextLine();
            String[] arrayInput = input.split(" ");
            int in1 = Integer.parseInt(arrayInput[0]);
            int in2 = Integer.parseInt(arrayInput[1]);

            if (in1 == 0 && in2 == 0) {
                run = false;
            } else {
                output = (in1 / in2) + " " + (in1 % in2) + " / " + in2;
                System.out.println(output);
            }
        }
    }
}

