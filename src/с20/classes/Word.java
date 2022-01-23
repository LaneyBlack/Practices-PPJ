package с20.classes;

public class Word {
    private char[] word;
    private int length;
    Word next;

    public Word() {
        this.word = new char[100];
        this.length = 0;
    }

    public void addChar(char nextChar) {
        word[length++] = nextChar;
    }

    public void show() {
        for (char val : word)
            if (val != 0)
                System.out.print(val);
    }

    //Getters|Setters
    public int getLength() {
        return length;
    }

    public char[] getWord() {
        return word;
    }
}
