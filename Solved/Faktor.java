package Solved;

import java.util.Scanner;

public class Faktor {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] collector = input.split(" ");
        int noOfPublished = Integer.parseInt(collector[0]);
        int impactFactor = Integer.parseInt(collector[1]);
        int bribe = noOfPublished * impactFactor - (noOfPublished - 1);
        System.out.println(bribe);
    }
}
