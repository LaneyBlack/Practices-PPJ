package c15;

import functions.Functions;

import java.util.Scanner;

import static functions.Functions.arrayPrint;
import static functions.Functions.fillWithRandom;

public class c15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------Ex.1-------------------");
        show(5);
        System.out.println("-------------------Ex.2-------------------");
        int wrt = 5;
        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt); //wrt is not changing cause operations are on another variable in another method
        System.out.println("-------------------Ex.3-------------------");
        System.out.println(findMax(16, 12, 19));
        System.out.println("-------------------Ex.4-------------------");
        char[] table1 = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        Functions.arrayPrint(table1);
        System.out.println("Please enter what char are you looking for");
        char toFind = in.next().charAt(0);
        findChar(toFind, table1);
        System.out.println("-------------------Ex.5-------------------");
        int[] table2 = new int[(int) (Math.random() * 20)], table3 = new int[(int) (Math.random() * 20)];
        int ex3arg = in.nextInt();
        fillWithRandom(table2,0,100);
        Functions.arrayPrint(table2);
        fillWithRandom(table3,0,100);
        Functions.arrayPrint(table3);
        Functions.arrayPrint(processEx5(ex3arg, table2, table3));
        System.out.println("-------------------Ex.6-------------------");
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(isEquals(arr1, arr2));
    }

    public static void show(int integer) {
        System.out.println(" " + integer + " ");
    }

    public static void modifyValue(int integer) {
        System.out.println(" " + integer + " ");
        integer *= 5;
        System.out.println("*5 = " + integer + " ");
    }

    public static int findMax(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        else
            return 0;
    }

    public static void findChar(char toFind, char[] tab) {
        byte counter = 0;
        for (int i = 0; i < tab.length; i++)
            if (tab[i] == toFind)
                counter++;
        System.out.println(toFind + " wystapilo " + counter + " razy");
    }

    public static int[] processEx5(int arg, int[] arr1, int[] arr2) {
        if (arg == 0 || arr1.length == arr2.length)
            return new int[0];
        else {
            int minSize = Math.min(arr1.length, arr2.length);
            if (arg < 0) {
                int[] resultTab = new int[minSize];
                for (int i = 0; i < resultTab.length; i++)
                    resultTab[i] = arr1[i] + arr2[i];
                return resultTab;
            } else {
                int maxSize = Math.max(arr1.length, arr2.length);
                int[] resultTab = new int[maxSize - minSize];
                for (int i = minSize; i < maxSize; i++)
                    resultTab[i - minSize] = ((arr1.length > arr2.length) ? arr1 : arr2)[i];
                return resultTab;
            }
        }
    }

    public static boolean isEquals(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length)
                return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j])
                    return false;
            }
        }
        return true;
    }
}
