package c14;

//import functions.Functions;
//import
//
//import static functions.Functions.*;

import functions.Functions;

import static functions.Functions.*;

public class c14 {
    public static void main(String[] args) {
        Functions fun = new Functions();
        System.out.println("-------------------Ex.1-------------------");
        int[] X = new int[15], Y = new int[15];
        for (int i = 0; i < X.length; i++) {
            X[i] = (int) (Math.random() * 16);
            Y[i] = (int) (Math.random() * 16);
        }
        arrayPrint(X);
        arrayPrint(Y);

        int minX = X[0], maxX = X[0], minY = Y[0], maxY = Y[0];
        for (int i = 1; i < X.length; i++) {
            if (minX > X[i])
                minX = X[i];
            if (maxX < X[i])
                maxX = X[i];
            if (minY > Y[i])
                minY = Y[i];
            if (maxY < Y[i])
                maxY = Y[i];
        }
        System.out.println("min X Y" + minX + "; " + minY);
        System.out.println("max X Y" + maxX + "; " + maxY);

        System.out.println("h = " + (maxY - minY));
        System.out.println("w = " + (maxX - minX));
        System.out.println("center = " + (maxY - minY) / 2 + "; " + (maxX - minX) / 2);

        System.out.println("-------------------Ex.2-------------------");
        int[] A = new int[20], B = new int[20];
        //Creating tables
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 40);
            B[i] = (int) (Math.random() * 40);
        }
        System.out.print("A: ");
        for (int var : A)
            System.out.print(var + " ");
        System.out.println();
        System.out.print("B: ");
        for (int var : B)
            System.out.print(var + " ");
        System.out.println();
        System.out.println("Sorting ...");
        //Sorting tables
        //Table A
        for (int i = 0; i < A.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < A.length; j++)
                if (A[minIndex] > A[j])
                    minIndex = j;
            int tmp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = tmp;
        }
        //Table B
        for (int i = 0; i < B.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < B.length; j++)
                if (B[maxIndex] < B[j])
                    maxIndex = j;
            int tmp = B[maxIndex];
            B[maxIndex] = B[i];
            B[i] = tmp;
        }
        System.out.print("A: ");
        for (int var : A)
            System.out.print(var + " ");
        System.out.println();
        System.out.print("B: ");
        for (int var : B)
            System.out.print(var + " ");
        System.out.println();

        int[] C = new int[A.length + B.length];
        for (int i = 0, iA = 0, iB = B.length - 1; i < C.length; i++)
            if (iA < A.length && iB >= 0 && A[iA] < B[iB])
                C[i] = A[iA++];
            else if (iB >= 0)
                C[i] = B[iB--];

        System.out.print("C: ");
        for (int var : C)
            System.out.print(var + " ");
        System.out.println();

        System.out.println("-------------------Ex.3-------------------");
        int tab[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.print("[");
        for (int i = 0; i < tab.length / 2; i++) {
            for (int j = i; j < tab.length - i; j++)
                System.out.print(tab[i][j] + "\t"); //right
            for (int j = i + 1; j < tab.length - i; j++)
                System.out.print(tab[j][tab[i].length - 1 - i] + "\t"); //down
            for (int j = tab.length - 2 - i; j >= i; j--)
                System.out.print(tab[tab.length - 1 - i][j] + "\t"); //left
            for (int j = tab.length - 2 - i; j > i; j--) //up
                System.out.print(tab[j][i] + "\t");

        }
        System.out.println("]");

        int [][] tab1 = {{1,2,3}, {4,5,6},{7,8,9}};
        arrayPrint(tab1);
        Functions functions = new Functions();
        arrayPrint(tab1);

        int[] arr2 = {1,7,4,5,8,9,3,2};
        arrayPrint(arr2);
        sortMinMax(arr2);
        arrayPrint(arr2);
        sortMaxMin(arr2);
        arrayPrint(arr2);
    }
}
