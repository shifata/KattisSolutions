package Solved;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] array = input.split("");
        int t = 0;
        int c = 0;
        int g = 0;
        int output;

        for (int i = 0; i < array.length; i++) {

            if (array[i].contains("C")) {
                c++;
            }
            if (array[i].contains("G")) {
                g++;
            }
            if (array[i].contains("T")) {
                t++;
            }
        }
        int set = Math.min(t, Math.min(c, g));


        output = (t * t) + (c * c) + (g * g) + (7 * set);

        System.out.println(output);

    }
}
