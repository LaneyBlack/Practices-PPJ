package c20.classes;

public class PhraseTable {
    private Word[] phrase;
    private int length;

    public PhraseTable () {
        phrase = new Word[100];
        length = 0;
    }

    public void addWordAtEnd (Word word) {
        phrase[length++] = word;
    }
    public void show () {
        for (int i = 0; i < length; i++) {
            phrase[i].show();
            System.out.print(" ");
        }
        System.out.println();
    }
}
