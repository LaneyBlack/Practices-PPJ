package с20.classes;

public class PhraseList {
    private Word head;

    public void addWordAtEnd (Word word) {
        if (head == null)
            head = word;
        else {
            Word w = head;
            while (w.next != null)
                w = w.next;
            w.next = word;
        }
    }

    public void show () {
        Word w = head;
        while (w!= null) {
            w.show();
            System.out.print(" ");
            w = w.next;
        }
        System.out.println();
    }
}
