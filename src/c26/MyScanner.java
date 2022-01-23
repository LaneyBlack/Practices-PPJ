package c26;

import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    private InputStream inputStream;

    public MyScanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String readWord() throws IOException {
        String res = "";
        try {
            int val;
            while ((val = inputStream.read()) != ' ' && //spacja
                    val != '\t' && //tabulacja
                    val != '\r' && // powrót karetki
                    val != '\n' && // nowa linia
                    val != '\f' //formfeed/page break
            ) {
                res += (char) val;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public String readLine() throws IOException {
        String res = "";
        try {
            int val;
            while ((val = inputStream.read()) != '\r' && // powrót karetki
                    val != '\n') {
                res += (char) val;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public int readNumber() throws IOException {
        boolean isNegative = false;
        int res = 0;
        try {
            int val;
            while ((val = inputStream.read()) != '\r' && // powrót karetki
                    val != '\n' // nowa linia
            ) {
                if (val == '-')
                    isNegative = true;
                else {
                    res *= 10;
                    res += val - '0';
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (isNegative) ? -res : res;
    }

    public int readPositiveNumber() throws Exception {
        int val = readNumber();
        if (val < 0)
            throw new Exception("This number is not positive");
        return val;
    }

    public void close() throws IOException {
        inputStream.close();
    }

}
