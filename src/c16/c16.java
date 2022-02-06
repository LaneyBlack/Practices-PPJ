package c16;

import functions.Functions;

import static functions.Functions.isArmstrongNumber;
import static functions.Functions.isPalindrom;

public class c16 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        System.out.println("----------------------------Ex.1----------------------------");
        functions.arrayPrint(Functions.splitToDigits(263));
        System.out.println("----------------------------Ex.2----------------------------");
        System.out.println(isArmstrongNumber(153));
        System.out.println("----------------------------Ex.3----------------------------");
        System.out.println("x coords                      y coords ");
        functions.arrayPrint(calculateSquares(200, 100, 10));
        System.out.println("----------------------------Ex.4----------------------------");
        char[] word1 = {'k', 'a', 'j', 'a', 'k'};
        char[] word2 = {'k', 'o', 't'};
        System.out.println(isPalindrom(word1));
        System.out.println(isPalindrom(word2));
        System.out.println("----------------------------Ex.5----------------------------");
        char[] word3 = {'a', 'n', 'n', 'a'};
        if (isPalindrom(word1, 0))
            palindromPrintln(word1);
        if (isPalindrom(word2, 0))
            palindromPrintln(word2);
        if (isPalindrom(word3, 0))
            palindromPrintln(word3);
        System.out.println("----------------------------Ex.6----------------------------");
        int[][] tab = new int[8][8];
        fill(tab, 0);
        functions.arrayPrint(tab);
    }

    //Ex1
    public static int[] splitToDigits(int val) {
        byte counter = 0;
        int valCopy = val;

        while (valCopy != 0) {
            valCopy /= 10;
            counter++;
        }
        int[] digits = new int[counter];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = val % 10;
            val /= 10;
        }
        return digits;
    }
    //Ex3
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int squaresAmount = ((screenHeight * screenWidth) / (side * side));
        //System.out.println("squadres amount = " + squaresAmount);
        int[][] squaresCoords = new int[(screenWidth / side)+1][(screenHeight / side) + 2];
        int x = 0, y = 0;
        for (int i = 0; i < squaresCoords.length; i++) {
            y = 0;
            for (int j = 1; j < squaresCoords[i].length; j++) {
                squaresCoords[i][j] = y;
                y += side;
            }
            squaresCoords[i][0] = x;
            x += side;
        }

        return squaresCoords;
    }

    //Ex5
    public static void palindromPrintln(char[] word) {
        System.out.print(palindromIndexingMiddle(word, word.length / 2 - 1));
        System.out.print(palindromIndexingEnd(word, word.length - 1));
        System.out.println();
    }

    public static String palindromIndexingMiddle(char[] word, int index) {
        if (index < 0)
            return "";
        else
            return word[index] + palindromIndexingMiddle(word, index - 1);
    }

    public static String palindromIndexingEnd(char[] word, int index) {
        int a = 1;
        if (word.length % 2 == 0)
            a = 0;
        if (index < word.length / 2 + a)
            return "";
        else
            return word[index] + palindromIndexingEnd(word, index - 1);
    }


    //Ex6
    public static void fill(int[][] tab, int i) {
        if (i > tab.length / 2)
            return;
        for (int j = i; j < tab.length - i; j++) {
            tab[i][j] = i + 1;
            tab[tab.length - 1 - i][j] = i + 1;
            tab[j][i] = i + 1;
            tab[j][tab.length - 1 - i] = i + 1;
        }
        fill(tab, ++i);
    }
}
