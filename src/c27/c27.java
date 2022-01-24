package c27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("-------------------------Ex1-------------------------");
//        int input = in.nextInt(); //
//        System.out.println((String.format("%32s", Integer.toBinaryString(input)).replaceAll(" ", "0")));
//        System.out.println("-------------------------Ex2-------------------------");
//        System.out.println("Please write a date (yyyy-mm-dd)");
//        String date = in.next();
//        String[] val = date.split("-");
//        System.out.println("Year: " + val[0]);
//        if (val.length>1) {
//            System.out.println("Month: " + val[1]);
//        }
//        if (val.length>2) {
//            System.out.println("Day: " + val[2]);
//        }
//        System.out.println("-------------------------Ex3-------------------------");
//        String ex3input = in.next();
//        if (isHexNumber(ex3input)){
//            System.out.println("This is a hex number");
//        } else {
//            System.out.println("This is not a hex number");
//        }
        System.out.println("-------------------------Ex4-------------------------");
        String text = "1-2 wieś w Polsce położona w województwie wielkopolskim, w powiecie" +
                "kolskim, w gminie Olszówka. W latach 1975-1998 1-2 miejscowość położona była w województwie konińskim.";
        int counter = 0;
        Pattern pattern = Pattern.compile("\\d+-\\d+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            text.replace(matcher.group(),"");
            counter++;
        }
        System.out.println(counter);
    }

    public static boolean isHexNumber(String number) {
        Pattern p = Pattern.compile("-?[0-9a-fA-F]+");
        Matcher m = p.matcher(number);
        boolean b = m.matches();
        return b;
    }
}
