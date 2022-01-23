package c25;

import functions.Functions;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class c25 {
    public static void main(String[] args) {
//        FileReader
//        FileWriter
        System.out.println("----------------------------------Ex1----------------------------------");
        try {
            FileInputStream input = new FileInputStream("Z:\\PPJ\\CwiczeniaVPN\\src\\c25\\zad1.txt");
            int length = input.available();
            System.out.println("Text file length = " + length);
            char[] charsfromBase = new char[length];
            for (int i = 0; i < length; i++)
                charsfromBase[i] = (char) (input.read());
            input.close();
            System.out.println(charsfromBase);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------Ex2----------------------------------");
        try {
            FileInputStream input = new FileInputStream("Z:\\PPJ\\CwiczeniaVPN\\src\\c25\\zad2.txt");
            byte[] textFile = input.readAllBytes();
            int sum = 0;
            String var = "";
            for (byte b : textFile) {
                if ((char) b != ' ')
                    var = var + (char) b;
                else {
                    sum += Integer.parseInt(var);
                    var = "";
                }
            }
            input.close();
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------Ex3----------------------------------");
        Scanner in = new Scanner(System.in);
        int numberOfFiles = 0;
        while (numberOfFiles < 1 || numberOfFiles > 5) {
            System.out.println("Please enter how many files do you want to create(>0 && <5): ");
            numberOfFiles = in.nextInt();
        }
        for (int i = 1; i <= numberOfFiles; i++) {
            int[] randomNumbers = new int[10];
            Functions.fillWithRandom(randomNumbers, 0, 1000);
            Functions.sortMinMax(randomNumbers);
            Functions.arrayPrint(randomNumbers);
            try {
                FileWriter writer = new FileWriter("Z:\\PPJ\\CwiczeniaVPN\\src\\c25\\zad3\\inputData" + i + ".txt");
                for (int val : randomNumbers) {
                    writer.write(Integer.toString(val));
                    writer.write(" ");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----------------------------------Ex4----------------------------------");
        int[] values = new int[numberOfFiles * 10];
        int counter = 0;
        for (int i = 1; i <= numberOfFiles; i++)
            try {
                FileInputStream input = new FileInputStream("Z:\\PPJ\\CwiczeniaVPN\\src\\c25\\zad3\\inputData" + i + ".txt");
                byte[] textFile = input.readAllBytes();
                String var = "";
                for (byte b : textFile)
                    if ((char) b != ' ')
                        var += (char) b;
                    else {
                        values[counter] = Integer.parseInt(var);
                        counter++;
                        var = "";
                    }
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        Functions.sortMinMax(values);
        Functions.arrayPrint(values);
    }
}
