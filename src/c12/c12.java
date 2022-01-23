package c12;

public class c12 {
    public static void main(String[] args) {
        System.out.println("------------------Ex.1------------------");
        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};
        byte ex1counter = 0;
        boolean isSymmetrical = false;
        if (tab.length % 2 == 0) {
            for (int i = 0; i < tab.length / 2; i++) {
                if (tab[i] == tab[tab.length - 1 - i]) {
                    ex1counter++;
                }
            }
            if (ex1counter == tab.length / 2)
                isSymmetrical = true;
        }
        System.out.println("Is symmetrical = " + isSymmetrical);

        System.out.println("------------------Ex.2------------------");
        byte trueCounter = 0;
        byte falseCounter = 0;
        boolean[] arr1 = {true, false, true, false, true, true, false, true, true, false, false, false, false, true, false};
        System.out.println("Boolean array: ");
        for (boolean var : arr1)
            System.out.print(var + ", ");
        System.out.println();

        for (boolean var : arr1)
            if (var)
                trueCounter++;
            else
                falseCounter++;

        boolean[] arrT = new boolean[trueCounter];
        boolean[] arrF = new boolean[falseCounter];
        for (int i = 0; i < trueCounter; i++)
            arrT[i] = true;
        for (int i = 0; i < falseCounter; i++)
            arrF[i] = false;
        System.out.println("True array: ");
        for (boolean var : arrT)
            System.out.print(var + ", ");
        System.out.println();
        System.out.println("False array: ");
        for (boolean var : arrF)
            System.out.print(var + ", ");
        System.out.println();

        System.out.println("------------------Ex.3------------------");
        long[] arr3 = new long[40];
        //Filling table
        for (int i = 0; i < arr3.length; i++)
            arr3[i] = i;
        //souting
        for (long var : arr3)
            System.out.print(var + ", ");
        System.out.println();
        boolean isInOrder = true;
        int inOrderCounter = 0;
        int timesCounter = 0;
        while (isInOrder) {
            inOrderCounter = 0;
            timesCounter++;
            arr3[(byte) (Math.random() * (arr3.length - 1))] = (long) (Math.random() * 100);
            arr3[(byte) (Math.random() * (arr3.length - 1))] = (long) (Math.random() * 100);
            for (int i = 0; i < arr3.length - 1; i++)
                if (arr3[i] == (arr3[i + 1] - 1))
                    inOrderCounter++;
            System.out.println("In order = " + inOrderCounter);
            for (long var : arr3)
                System.out.print(var + ", ");
            System.out.println();
            System.out.println(timesCounter + ": ");
            if (inOrderCounter == 0)
                isInOrder = false;
        }

    }
}
