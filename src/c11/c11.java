package c11;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class c11 {
    public static void main(String[] args) {
        System.out.println("---------------------------Ex.1---------------------------");
        double[] tab1 = new double[10];
        for (int i = 0; i < tab1.length; i++)
            tab1[i] = (1 + Math.random() * 100);

        System.out.println("Table:");
        for (double val : tab1)
            System.out.print(val + ", ");

        System.out.println();
        System.out.println("Numbers with even indexes:");
        for (int i = 0; i < tab1.length; i++)
            if (i % 2 == 0)
                System.out.print(tab1[i] + ", ");

        System.out.println();
        System.out.println("Number that after rounding are mot even:");
        for (double val : tab1)
            if ((int) val % 2 != 0)
                System.out.print(val + ", ");
        System.out.println();

        System.out.println("---------------------------Ex.2---------------------------");
        char[] tab2 = new char[]{'n', 't', 'o', 'n', 'a', '|', 'r', 'e', 'u', 't'};
        char min = tab2[1];
        int ind = 0;
        for (int i = 0; i < tab2.length; i++)
            if (tab2[i] < min) {
                min = tab2[i];
                ind = i;
            }
        System.out.println(min + " - " + ind);
        System.out.println("---------------------------Ex.3---------------------------");
//
//        Scanner in = new Scanner(System.in);
//        char[] tab3 = new char[10];
//        for (int i = 0; i < tab3.length; i++)
//            tab3[i] = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
//        for (char val : tab3)
//            System.out.print(val + ", ");
//        System.out.println();
//
//        byte zeroCounter = 0;
//        do {
//            char c = in.next().charAt(0);
//            for (int i = 0; i < tab3.length; i++) {
//                if (c == tab3[i]) {
//                    tab3[i] = '0';
//                    zeroCounter++;
//                }
//            }
//            for (char var : tab3)
//                System.out.print(var + ", ");
//            System.out.println();
//        } while (zeroCounter != tab3.length);

        System.out.println("---------------------------Ex.4---------------------------");
        int[] tab4 = new int[(int) (10 + Math.random() * 5)];
        for (int i = 0; i < tab4.length; i++)
            tab4[i] = i;
        System.out.println("Table is: ");
        for (int var : tab4)
            System.out.print(var + ", ");
        System.out.println();
        for (int i = tab4.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int a = tab4[index];
            tab4[index] = tab4[i];
            tab4[i] = a;
        }

        for (int var : tab4)
            System.out.print(var + " ");
        System.out.println();
        for (int i = 0; i < tab4.length; i++) {
            for (int var : tab4) {
                if (var < 10) {
                    if (var != i) {
                        System.out.print(". ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (var != i) {
                        System.out.print(" . ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------Ex.5---------------------------");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            arr1[i] = (int) (1 + Math.random() * 100);
            arr2[i] = (int) (1 + Math.random() * 100);
        }
        for (int var : arr1)
            System.out.print(var + ", ");
        System.out.println();
        for (int var : arr2)
            System.out.print(var + ", ");
        System.out.println();
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length)
                arr3[i] = arr1[i];
            else
                arr3[i] = arr2[i - arr1.length];
        }
        for (int var : arr3)
            System.out.print(var + ", ");
        System.out.println();
        int minInt = arr3[0], maxInt = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < minInt) {
                minInt = arr3[i];
            }
            if (arr3[i] > maxInt) {
                maxInt = arr3[i];
            }
        }
        System.out.println("Min is : " + minInt);
        System.out.println("Max is : " + maxInt);
        int[] arr4 = new int[maxInt - minInt + 1];
        for (int i = 0; i < arr4.length; i++)
            arr4[i] = minInt++;
        for (int var : arr4)
            System.out.print(var + ", ");
        System.out.println();
    }
}
