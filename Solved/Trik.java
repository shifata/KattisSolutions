package Solved;

import java.util.Scanner;

class Trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ball = 0;
        String moves = scan.next();

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'A' && ball != 2)
                ball = 1 - ball;

            if (moves.charAt(i) == 'B' && ball != 0)
                ball = 3 - ball;

            if (moves.charAt(i) == 'C' && ball != 1)
                ball = 2 - ball;
        }

        System.out.println(ball + 1);
    }
}