package test;

public class test {
    public static void main(String[] args) {
        String s = "offends repeats all are wowe";
        System.out.println(minSum(s));
    }

    public static String minSum(String input) {
        String[] words = input.trim().split(" ");
        String result = words[0];
        for (int i = 1; i < words.length ; i++)
            if (getUniques(result) > getUniques(words[i]))
                result = words[i];
        return result;
    }

    public static int getUniques(String string) {
        int matches = 0;
        for (int i = 0; i < string.length()-1; i++)
            if (string.charAt(i)!='1'){
                string.replaceAll(String.valueOf(string.charAt(i)),"1");
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
