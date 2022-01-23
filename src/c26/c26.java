package c26;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class c26 {
    public static void main(String[] args) throws IOException {
//        InputStream streamIn = System.in;
//        System.out.println("--------------------------------Ex1--------------------------------");
//        try {
//            System.out.println(streamIn.read());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("--------------------------------Ex2--------------------------------");
//        int val;
//        while (streamIn.available() > 0) {
//            val = streamIn.read();
//            if (val != 10)
//                System.out.println((char) val + " - " + val);
//            else
//                System.out.println("End");
//        }
//
//        System.out.println("--------------------------------Ex3--------------------------------");
//        MyScanner myScanner = new MyScanner(streamIn);
//        System.out.println("Please enter a word: ");
//        System.out.println(myScanner.readWord());
//        System.out.println("Please enter a line: ");
//        System.out.println(myScanner.readLine());
//        System.out.println("Please enter a number: ");
//        System.out.println(myScanner.readNumber());
//        System.out.println("Please enter a positive number: ");
//        try {
//            System.out.println(myScanner.readPositiveNumber());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        myScanner.close();
        System.out.println("--------------------------------Ex4--------------------------------");
        FileReader reader = new FileReader("C:\\Users\\Laney_Black\\Desktop\\PJATK\\PPJ\\Cwiczenia\\src\\c26\\input.txt");
        PNWReader pnwReader = new PNWReader(reader, 'N'); // P - Pierwsze, N - Narcystyczne, W - Wyrazy
        long startTime = System.currentTimeMillis();
        pnwReader.showString();
        long endTime = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println("Time required: " + (endTime - startTime));
    }
}
