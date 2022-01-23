package c17;

import functions.Functions;

import java.util.Scanner;

public class c17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------------------------Ex.1----------------------------");
        System.out.println("Please write down month and year:");
        printMonth(in.nextInt(), in.nextInt());
        System.out.println("----------------------------Ex.2----------------------------");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Functions.arrayPrint(array);
        swap(array, 1, 2);
        Functions.arrayPrint(array);
        System.out.println("----------------------------Ex.3----------------------------");
        Functions.arrayPrint(Functions.fromStringToChar("ala"));
        System.out.println("----------------------------Ex.4----------------------------");
        permutations(123);
        System.out.println("----------------------------Ex.5----------------------------");
        int[] array1 = {78, 45, 2, 357, 89, 230, 65, 4, 3, 74, 8};
        Functions.sortMinMax(array1);
        Functions.arrayPrint(array1);
    }

    //Ex1
    public static void printMonth(int month, int year) {
        if (month > 12 || month < 0)
            System.out.println("Error. !0<month<12!");
        System.out.println();
        int days = calculateDaysofMonth(month, year);
        int daysOffset = 0;
        //01.01.2001 was Monday
        for (int i = 2001; i < year; i++)
            if (i % 4 != 0)
                daysOffset += 365;
            else
                daysOffset += 366;

        for (int i = 1; i < month; i++) {
            daysOffset += calculateDaysofMonth(i, year);
        }
        int day = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (daysOffset % 7 == 0 && day <= days)
                    if (day < 10)
                        System.out.print(day++ + "  ");
                    else
                        System.out.print(day++ + " ");
                else {
                    System.out.print("   ");
                    daysOffset--;
                }
            }
            System.out.println();
        }
    }

    public static int calculateDaysofMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
            default -> 31;
        };
    }

    //Ex2
    public static void swap(int[] tab, int source, int destination) {
        int temp = tab[source];
        tab[source] = tab[destination];
        tab[destination] = temp;
    }

    public static void permutations(int number) {
        int[] digits = splitToDigits(number);
        permutationRe(digits, 0, digits.length - 1);
    }

    public static void permutationRe(int[] digits, int startIndex, int lastIndex) {
        if (startIndex == lastIndex)
            Functions.arrayPrint(digits);
        else {
            for (int i = startIndex; i <= lastIndex; i++) {
                swap(digits, startIndex, i);
                //Functions.arrayPrint(digits);
                permutationRe(digits, startIndex + 1, lastIndex);
                swap(digits, startIndex, i);
            }
        }
    }

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
}
