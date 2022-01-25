package functions;

public class Functions {
    //Arrays toString
    public static void arrayPrint(byte[] arr) {
        System.out.print("[");
        for (byte val : arr)
            System.out.print(val + " ");
        System.out.println("]");
    }

    public static void arrayPrint(int[] arr) {
        System.out.print("[");
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println("]");
    }

    public static void arrayPrint(double[] arr) {
        System.out.print("[");
        for (double val : arr)
            System.out.print(val + " ");
        System.out.println("]");
    }

    public static void arrayPrint(char[] arr) {
        System.out.print("[");
        for (char val : arr)
            System.out.print(val + " ");
        System.out.println("]");
    }

    public static void arrayPrint(int[][] arr) {
        System.out.print("[");
        for (int[] val : arr) {
            System.out.print("[");
            for (int var : val)
                System.out.print(var + " ");
            System.out.println("] ");
        }
        System.out.println("]");
    }

    //Sorting
    public static void sortMinMax(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++)
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void sortMaxMin(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i; j < array.length; j++)
                if (array[maxIndex] < array[j])
                    maxIndex = j;
            int tmp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = tmp;
        }
    }

    public static boolean isPalindrom(char[] word) {
        return isPalindrom(word, 0);
    }

    public static boolean isPalindrom(char[] word, int index) {
        if (word[index] == word[word.length - 1 - index])
            if (index < word.length / 2)
                return isPalindrom(word, ++index);
            else
                return true;
        return false;
    }

    //Filling
    public static void fillWithRandom(int[] array, int from, int border) {
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (from + Math.random() * border);
    }

    //Math functions
    public static long factorial(int number) {
        return factorial(number, number);
    }

    public static long factorial(int number, int index) {
        if (index < 2)
            return number;
        number *= index - 1;
        return factorial(number, index - 1);
    }

    public static boolean isArmstrongNumber(int val) {
        if (val == 0)
            return false;
        int[] digits = splitToDigits(val);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == val;
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number / 2; i++)
            if (number % i == 0)
                return false;
        return true;
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

    public static char[] fromStringToChar(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static String convertToNumericSystem32(int value, int system) {
        switch (system) {
            case 2, 4, 8, 16:
                break;
            default:
                throw new RuntimeException("Wrong numeric system");
        }
        String result = "";
        int iterator = (int) Math.sqrt(system);
        for (int i = 0; i < 31; i += iterator) {
            int tmp = ((value >> i) & (system - 1));
            result = tmp < 10 ? tmp + result : (char) ('A' + tmp - 10) + result;
        }
        return result;
    }
}
