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
            Matcher matcher = Pattern.compile("([A-Z]\\.)+").matcher(ex1);
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
        int res = 0;
        try (FileReader fileReader = new FileReader("src/с28/byteNumberInput.txt")) {
            int val = 0;
            while ((val = fileReader.read()) != -1)
                res = (res << 1) | (val - '0');
            System.out.println("File value = " + res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream output = new FileOutputStream("src/с28/byteNumberOutput.txt");
            while (res > 0) {
                output.write(res & 0b1111_1111);
                res >>= 8;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------Ex3---------------------------");
        StringBuilder logs = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("src/с28/serverLog.txt");
            int var;
            while ((var = fileReader.read()) != -1) {
                logs.append((char) var);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("(\\d+\\.){1,3}\\d+");
        Matcher matcher = pattern.matcher(logs);
        int counter = 0;
        while (matcher.find())
            System.out.println(++counter + "\t" + matcher.group());
    }
}
