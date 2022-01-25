package с28;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c28 {
    public static void main(String[] args) {
        System.out.println("---------------------------Ex1---------------------------");
        {
            String ex1 = "A.B.C.D.";
            Matcher matcher = Pattern.compile("([A-Z]\\.){4}").matcher(ex1);
            System.out.println(matcher.matches());
            //I thought that exercise was to change symbols
//        while (matcher.find()) {
//            String replacement = String.valueOf((char)('z' - (Math.random() * ('z' - 'a'))));
//            ex1 = ex1.replace(matcher.group(), replacement);
//        }
//        System.out.println(ex1);
        }
        System.out.println("---------------------------Ex2---------------------------");
        //reading
        int value = 0;
        try {
            FileReader fileReader = new FileReader("src/с28/byteNumber.txt");
            int var;
            while((var=fileReader.read())!=-1) {
                value = value << 1| (var-'0');
            }
            System.out.println(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream output = new FileOutputStream("src/с28/byteNumber.txt");
            while (value>0) {
                output.write(value & 0b1111_1111);
                value >>= 8;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------Ex3---------------------------");
        StringBuilder logs = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("src/с28/serverLog.txt");
            int var;
            while((var = fileReader.read())!=-1) {
                logs.append((char)value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcher = pattern.matcher(logs);
        int counter = 0;
        while (matcher.find())
            System.out.println(++counter + "\t" + matcher.group());
    }
}
