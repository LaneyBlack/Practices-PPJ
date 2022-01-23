package с21.classes;

public class MyQueue {
    private int length;
    private Element head;

    public void put (Element element) {
        if (head==null)
            head = element;
        else {
            Element tmp = head;
            while (tmp.getNext()!=null)
                tmp = tmp.getNext();
            tmp.setNext(element);
//            element.setPrevious(tmp);
        }
    }

    public Element get () {
        Element tmp = head;
        head = head.getNext();
        tmp.setNext(null);
//        head.getNext().setPrevious(null);
        return tmp;
    }

    public void show() {
        Element tmp = head;
        while (tmp!=null) {
            tmp.show();
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    public MyQueue() {
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
