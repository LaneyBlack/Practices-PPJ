package c21.classes;

public class MyStackTable {
    Student[] stack;
    private int length;

    public MyStackTable(int size) {
        this.stack = new Student[size];
        length = 0;
    }

    public void push(Student student) {
        if (length < stack.length)
            for (int i = stack.length - 1; i >= 0; i--) {
                if (stack[i] == null) {
                    stack[i] = student;
                    length++;
                    break;
                }
            }
        else
            System.out.println("Stack is full");
    }

    public Student pop() {
        Student tmp = null;
        if (length!=0) {
            for (int i = 0; i < stack.length; i++)
                if (stack[i] != null) {
                    tmp = stack[i];
                    stack[i] = null;
                    length--;
                    break;
                }
        } else
            System.out.println("Error! Stack is empty");
        return tmp;
    }

    public void show() {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i]!=null)
                stack[i].show();
        }
    }
}
