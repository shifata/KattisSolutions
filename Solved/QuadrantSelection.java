package Solved;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int whichQuadrant = 0;

        if (x > 0 && y > 0) {
            whichQuadrant = 1;
        } else if (x > 0 && y < 0) {
            whichQuadrant = 4;
        } else if (x < 0 && y > 0) {
            whichQuadrant = 2;
        } else if (x < 0 && y < 0) {
            whichQuadrant = 3;
        } else {
        }
        System.out.println(whichQuadrant);


    }
}