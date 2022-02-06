package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "offends repeats all are wowe";
        System.out.println(getUniques("abbababaaba"));
        System.out.println(minSum(s));
//        ArrayList<Integer> arrayListTree = new ArrayList(Arrays.asList(1, 2, 2, 4, 3, 3, 4, 8, 7, 6, 5, 5, 6, 7, 8));
//        System.out.println(isTree(arrayListTree));
    }

//    public static boolean isTree(ArrayList<Integer> tree) {
//        for (int i = 0; i < tree.size(); i++) {
//            ArrayList<Integer> var = new ArrayList();
//            for (int j = 0; j <= i * 2; j++)
//                var.add(tree.get(j));
//            if (!isPalindrome(var))
//                return false;
//            for (int j = 0; j < i * 2; j++)
//                tree.remove(j);
//
//        }
//        return true;
//    }

//    public static boolean isPalindrome(ArrayList arrayList) {
//        for (int i = 0; i < arrayList.size() / 2; i++)
//            if (!arrayList.get(i).equals(arrayList.get(arrayList.size() - 1 - i)))
//                return false;
//        return true;
//    }

    public static String minSum(String input) {
        String[] words = input.trim().split(" ");
        String result = words[0];
        for (int i = 1; i < words.length; i++)
            if (getUniques(result) > getUniques(words[i]))
                result = words[i];
        return result;
    }

    public static int getUniques(String string) {
        int matches = 0;
        for (int i = 0; i < string.length(); i++) {
            string = string.replaceAll(String.valueOf(string.charAt(i)), "");
            matches++;
        }
        return matches;
    }

    public static String stringEnum(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].indexOf((char) (i + 1 + '0')) != -1) {
                    result.append(words[j]).append(" ");
                    break;
                }
            }
        }
        return String.valueOf(result);
    }

    public static String toBrackets(String string) {
        boolean isRepeated = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '(' && string.charAt(i) != ')' && string.charAt(i) != '\f') {
                for (int j = i + 1; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j)) {
                        isRepeated = true;
                        break;
                    }
                }
                if (isRepeated)
                    string = string.replaceAll(String.valueOf(string.charAt(i)), ")");
                else
                    string = string.replaceAll(String.valueOf(string.charAt(i)), "(");
                isRepeated = false;
            }
        }
        return string;
    }
}
