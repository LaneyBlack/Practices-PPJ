package c27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------Ex1-------------------------");
        int value = in.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 31; i >= 0; i--) // binary from 30, cause first time we >> and leave 00 bits  (32-1=31)
            output.append(value >> i & 0b1);
        System.out.println(output);
        output = new StringBuilder();
        for (int i = 30; i >= 0; i -= 2) //quad from 30, cause first time we >> and leave 00 bits  (32-2=30)
            output.append(value >> i & 0b11);
        System.out.println(output);
        output = new StringBuilder();
        for (int i = 30; i >= 0; i -= 3)  //oct from 30, cause 32/3!=0 => first time we pick 00 bytes, and then 000
            output.append(value >> i & 0b111);
        System.out.println(output);
        output = new StringBuilder();
        for (int i = 28; i >= 0; i -= 4) { //hex from 28, cause first time we pick 0000 bytes (32-4=28)
            int tmp = value >> i & 0b1111;
            output.append((tmp < 10) ? tmp : (char) ('A' + (tmp - 10)) + "");
        }
        System.out.println(output);
        System.out.println("-------------------------Ex2-------------------------");
        {
            System.out.println("Please write a date (yyyy-mm-dd)");
            String date = in.next();
//            Pattern pattern = Pattern.compile("[12][0-9]{3}-((0[1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[01]))");
            Pattern pattern = Pattern.compile("[0-9]{4}-" +
                    "((([1-9])|(1[0-2]))|[1-9])-" +
                    "(([1-9])|([0-2][0-9])|(3[01]))");
            if (pattern.matcher(date).matches())
                System.out.println(date);
            else
                System.out.println("Wrong date input");
            //trim example
//          String date = in.next();
//          String[] val = date.split("-");
//          System.out.println("Year: " + val[0]);
//          if (val.length > 1) {
//              System.out.println("Month: " + val[1]);
//           }
//           if (val.length > 2) {
//               System.out.println("Day: " + val[2]);
//           }
        }
        System.out.println("-------------------------Ex3-------------------------");
        {
            String ex3input = in.next();
            if (isHexNumber(ex3input)) {
                System.out.println("This is a hex number");
            } else {
                System.out.println("This is not a hex number");
            }
        }
        System.out.println("-------------------------Ex4-------------------------");
        {
            String text = "1-2 wieś w Polsce położona w województwie wielkopolskim, w powiecie" +
                    "kolskim, w gminie Olszówka. W latach 1975-1998 1-2 miejscowość położona była w województwie konińskim.";
            int counter = 0;
            Pattern pattern = Pattern.compile("\\d+-\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find())
                counter++;
//                text.replace(matcher.group(), ""); //don't know why, butt find goes to the next characters after finding one
            System.out.println(counter);
        }
    }

    public static boolean isHexNumber(String number) {
//        Pattern p = Pattern.compile("[0-9a-fA-F]+");
        return Pattern.compile("[0-9a-fA-F]+").matcher(number).matches();
    }
}
