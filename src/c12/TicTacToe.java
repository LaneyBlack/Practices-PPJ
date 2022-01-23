package c12;

import java.util.Scanner;

public class TicTacToe {
    public static byte[] field = {0, 0, 0, 0, 0, 0, 0, 0, 0}; //9 fields

    //empty - 0; circle - 1; cross - 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("That's a tic tac toe game!");
        System.out.println("Here is your field: ");
        byte index = 0;
        for (int j = 0; j < 3; j++) {

            System.out.println(index++
                    + " | "
                    + index++ +
                    " | "
                    + index++);
            if (j < 2)
                System.out.println("---------");
        }
        boolean firstPlayerWin = false;
        boolean secondPlayerWin = false;
        while (!secondPlayerWin || !firstPlayerWin || !isFieldFilled()) {
            System.out.println("Player 1. Write what field should be filled with X (from 0 to 8)");
            byte player1 = in.nextByte();
            if (field[player1]==0)
                field[player1] = 2;
            else {
                System.out.println("Error. This field is not empty!");
                player1 = in.nextByte();
                field[player1] = 2;
            }
            fieldToString();
            firstPlayerWin = isWin();
            if (firstPlayerWin) {
                System.out.println("---------------Player 1 wins !!!---------------");
                break;
            }
            if (isFieldFilled()) {
                System.out.println("Draw");
                break;
            }

            System.out.println("Player 2. Write what field should be filled with O (from 0 to 8)");
            byte player2 = in.nextByte();
            if (field[player2]==0)
                field[player2] = 1;
            else {
                System.out.println("Error. This field is not empty!");
                player2 = in.nextByte();
                field[player2] = 1;
            }
            fieldToString();
            secondPlayerWin = isWin();
            if (secondPlayerWin) {
                System.out.println("---------------Player 2 wins !!!---------------");
                break;
            }
            if (isFieldFilled()) {
                System.out.println("Draw");
                break;
            }
        }
    }

    public static void fieldToString() {
        byte index = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println((field[index] == 1 ? "O" : field[index] == 2 ? "X" : " ")
                    + " | "
                    + (field[(index+1)] == 1 ? "O" : field[(index+1)] == 2 ? "X" : " ") +
                    " | "
                    + (field[(index+2)] == 1 ? "O" : field[(index+2)] == 2 ? "X" : " "));
            index+=3;
            if (j < 2)
                System.out.println("---------");
        }
    }

    public static boolean isWin() {
        boolean winned = false;
        for (int i = 0; i < field.length; i++) {
            if (field[i] != 0) {
                if (i % 3 == 0) //Horizontal Line
                    if (field[i] == field[i + 1] && field[i + 1] == field[i + 2])
                        winned = true;
                if (i < 3) //Vertical line
                    if (field[i] == field[i + 3] && field[i + 3] == field[i + 6])
                        winned = true;
                if (i == 0) //corner to corner
                    if (field[i] == field[i + 4] && field[i + 4] == field[i + 8])
                        winned = true;
                if (i == 2) //corner to corner
                    if (field[i] == field[i + 2] && field[i + 2] == field[i + 4])
                        winned = true;
            }
        }
        return winned;
    }

    public static boolean isFieldFilled() {
        boolean isFilled = true;
        for (byte val :
                field) {
            if (val == 0)
                isFilled = false;
        }
        return isFilled;
    }
}
