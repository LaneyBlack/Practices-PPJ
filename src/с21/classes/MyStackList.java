package с21.classes;

public class MyStackList {
    private Student head;
    private int size;
    private int length;

    public MyStackList(int size) {
        this.size = size;
        this.length = 0;
    }

    public void push(Student student) {
        if (length < size) {
            if (head != null)
                student.setNext(head);
            head = student;
            length++;
        } else
            System.out.println("Stack is full!");
    }

    public Student pop() {
        if (head == null) {
            System.out.println("Error! Stack is empty");
            return null;
        } else {
            Student tmp = head;
            head = head.getNext();
            return tmp;
        }
    }

    public void show(){
        System.out.println("Stack size = " + size + "\nStack:");
        Student tmp = head;
        while (tmp!=null) {
            tmp.show();
            tmp = tmp.getNext();
        }
    }
}
