package c26;

import java.io.FileReader;
import java.io.IOException;

import static functions.Functions.isArmstrongNumber;
import static functions.Functions.isPrimeNumber;

public class PNWReader {
    private static final char P = 'P';
    private static final int N = 'N';
    private static final int W = 'W';
    private FileReader fileReader;
    private char outputType;

    public PNWReader(FileReader fileReader, char outputType) {
        this.fileReader = fileReader;
        if (outputType != P && outputType != N && outputType != W)
            throw new IllegalArgumentException("There is no such type!");
        this.outputType = outputType;
    }

    public void show() throws IOException {
        if (!fileReader.ready())
            throw new IllegalStateException("This method was already used");
        if (outputType == 'P' || outputType == 'N') {
            int val, res = 0;
            try {
                while ((val = fileReader.read()) != -1) {
                    if (val >= '0' && val <= '9') {
                        res *= 10;
                        res += val - '0';
                    }
                    if (val == ' ') {
                        if (outputType == P && isPrimeNumber(res))
                            System.out.print(res + " ");
                        else if (outputType == N && isArmstrongNumber(res))
                            System.out.print(res + " ");
                        res = 0;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            boolean firstSpace = false;
            StringBuilder res = new StringBuilder();
            int val;
            while ((val = fileReader.read()) != -1) {
                if ((val < '0' || val > '9') && val != ' ') {
                    res.append((char) val);
                    firstSpace = true;
                }
                if (val == ' ' && firstSpace) {
                    System.out.println(res);
                    res = new StringBuilder();
                    firstSpace = false;
                }
            }
        }
    }

    public void showString() throws IOException {
        if (!fileReader.ready())
            throw new IllegalStateException("This method was already used");
        int val;
        StringBuilder textFile = new StringBuilder();
        while ((val = fileReader.read()) != -1)
            textFile.append((char) val);
        String[] result = textFile.toString().split(" ");
        if (outputType == 'N') {
            for (String var : result) {
                if ((var.charAt(0) > '0' && var.charAt(0) < '9') && isArmstrongNumber(Integer.parseInt(var)))
                    System.out.print(var + " ");
            }
        } else if (outputType == 'P') {
            for (String var : result) {
                if ((var.charAt(0) > '0' && var.charAt(0) < '9') && isPrimeNumber(Integer.parseInt(var)))
                    System.out.print(var + " ");
            }
        } else if (outputType == 'W') {
            for (String var : result)
                if (var.charAt(0) < '0' || var.charAt(0) > '9')
                    System.out.print(var + " ");
        }
    }
}
