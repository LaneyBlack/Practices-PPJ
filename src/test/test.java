package test;

public class test {
    public static void main(String[] args) {
        System.out.println(toBrackets("recede"));
        System.out.println(toBrackets("dad"));
        System.out.println(toBrackets("bear"));
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
