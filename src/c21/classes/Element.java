package c21.classes;

public class Element {
    private Element next;
//    private Element previous;
    private String data;

    public Element(String data) {
        this.data = data;
    }

    public void show(){
        System.out.print(data + " ");
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

//    public Element getPrevious() {
//        return previous;
//    }
//
//    public void setPrevious(Element previous) {
//        this.previous = previous;
//    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
