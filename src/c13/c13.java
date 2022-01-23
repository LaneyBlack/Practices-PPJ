package c13;

import java.util.Scanner;

public class c13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------Ex.1---------------------------");
        System.out.println("Give me size of painting (side length will be 2*size + 1): ");
        int size = in.nextInt();
        int side = ((size * 2) + 1);
        int index = size;
        for (int rows = 1; rows <= side; rows++) {
            System.out.print(rows);
            if (rows < size + 1)
                for (int k = 0; k < side; k++)
                    if (((k > (size - rows)) && (k < (size + rows))) || k == size)
                        System.out.print(" *");
                    else
                        System.out.print(" .");

            else if (rows == size + 1)
                for (int j = 0; j < side; j++)
                    System.out.print(" *");
            else {
                for (int j = 0; j < side; j++)
                    if (j == size || (j > size - index && j < size + index))
                        System.out.print(" *");
                    else
                        System.out.print(" .");

                index--;
            }
            System.out.println();
        }

        System.out.println("---------------------------Ex.2---------------------------");
        int[] arr = {153, 333, 370, 515, 407, 80};
        for (int val :
                arr) {
            //parsing numbers to table
            int[] numbers = new int[3];
            byte j = 0;
            int temp = val;
            for (int i = 2; i >= 0; i--) {
                numbers[j] = (int) (temp / Math.pow(10, i));
                temp -= ((int) (temp / Math.pow(10, i))) * Math.pow(10, i);
                j++;
            }
            if (val == Math.pow(numbers[0], numbers.length) + Math.pow(numbers[1], numbers.length) + Math.pow(numbers[2], numbers.length))
                System.out.println(val + " is an Armstrong's number!");
            else
                System.out.println(val + " is not an Armstrong's number!");
        }

        System.out.println("---------------------------Ex.3---------------------------");
        int[] ex3i = new int[10];
        double[] ex3d = new double[10];
        double[][] ex3 = new double[10][2];
        for (int i = 0; i < ex3d.length; i++) {
            ex3d[i] = Math.random() * 10;
            ex3i[i] = (int) ex3d[i];
        }
        System.out.print("[");
        for (int var : ex3i)
            System.out.print(var + " ");
        System.out.println("]");
        System.out.print("[");
        for (double var : ex3d)
            System.out.print(var + " ");
        System.out.println("]");

        //Making one table out of two
        for (int i = 0; i < ex3.length; i++) {
            ex3[i][0] = (int) ex3d[i];
            ex3[i][1] = ex3d[i];
        }
        System.out.print("[");
        for (double[] var : ex3)
            System.out.print("{ " + (int) var[0] + " " + var[1] + " } ");
        System.out.println("]");

        //Sorting big table
        for (int j = 0; j < ex3.length - 1; j++) {
            int minInd = j;
            for (int i = j + 1; i < ex3.length; i++)
                if (ex3[i][0] + ex3[i][1] < ex3[minInd][0] + ex3[minInd][1])
                    minInd = i;
            double tmp1 = ex3[j][0];
            double tmp2 = ex3[j][1];
            ex3[j][0] = ex3[minInd][0];
            ex3[j][1] = ex3[minInd][1];
            ex3[minInd][0] = tmp1;
            ex3[minInd][1] = tmp2;
        }
        System.out.print("[");
        for (double[] var : ex3)
            System.out.print("{ " + (int) var[0] + " " + var[1] + " } ");
        System.out.println("]");


        System.out.println("---------------------------Ex.4---------------------------");
        int[][] tab4 = {{1, 0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1}};
        int ex4size = 0;

        for (int i = 0; i < tab4.length; i++) {
            ex4size += tab4[i].length;
        }

        int[] tabZ4 = new int[ex4size];
        int indexZ4 = 0;

        for (int i = 0; i < tab4.length; i++) {
            for (int j = 0; j < tab4[i].length; j++) {
                tabZ4[indexZ4] = tab4[i][j];
                indexZ4++;
            }
        }

        for (int var : tabZ4) {
            System.out.print(var + ", ");
        }
        System.out.println();


        System.out.println("---------------------------Ex.5---------------------------");
        int[] ex5tab1 = new int[(int) (5 + Math.random() * 10)];
        int[] ex5tab2 = new int[(int) (5 + Math.random() * 10)];
        int[] ex5tab3 = new int[(int) (5 + Math.random() * 10)];
        for (int i = 0; i < ex5tab1.length; i++)
            ex5tab1[i] = (int) (Math.random() * 10);
        for (int i = 0; i < ex5tab2.length; i++)
            ex5tab2[i] = (int) (Math.random() * 10);
        for (int i = 0; i < ex5tab3.length; i++)
            ex5tab3[i] = (int) (Math.random() * 10);

        int[][] ex5tab = new int[3][];
        ex5tab[0] = ex5tab1;
        ex5tab[1] = ex5tab2;
        ex5tab[2] = ex5tab3;
        for (int i = 0; i < ex5tab.length; i++) {
            System.out.print(i + " :[ ");
            for (int j = 0; j < ex5tab[i].length; j++) {
                System.out.print(ex5tab[i][j] + " ");
            }
            System.out.println("]");
        }


        System.out.println("---------------------------Ex.6---------------------------");
        float[][] tabEx6 = new float[8][8];
        for (int i = 0; i < tabEx6.length; i++) {
            for (int j = 0; j < tabEx6[i].length; j++) {
                tabEx6[i][j] = (float) (Math.random() * 10);
            }
        }
        float sum1 = 0, sum2 = 0;
        for (int i = 0; i < tabEx6.length; i++) {
            sum1 += tabEx6[i][i];
            sum2 += tabEx6[i][(tabEx6.length - 1) - i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
