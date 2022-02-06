package c21;

import c21.classes.*;

public class c21 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------Ex1--------------------------------------------");
        Student student1 = new Student(24382, "Anton");
        Student student2 = new Student(24390, "Polina");
        Student student3 = new Student(22326, "Diana");
        Student student4 = new Student(55626, "Ivan");
        Student student5 = new Student(25902, "Eugene");
        System.out.println("---Table---");
        MyStackTable tableStack = new MyStackTable(5);
        tableStack.pop();
        tableStack.push(student1);
        tableStack.push(student2);
        tableStack.push(student3);
        tableStack.push(student4);
        tableStack.push(student5);
        tableStack.push(student5);
        tableStack.show();
        tableStack.pop();
        System.out.println();
        tableStack.show();
        System.out.println("---Stack---");
        MyStackList stack = new MyStackList(5);
        stack.pop();
        stack.push(student1);
        stack.push(student2);
        stack.push(student3);
        stack.push(student4);
        stack.push(student5);
        stack.push(student1);
        stack.push(student2);
        stack.show();
        stack.pop();
        stack.show();
        System.out.println("--------------------------------------------Ex2--------------------------------------------");
        String[] A = {"PSG", "Atletico Madryt", "Sporting CP", "Inter", "Benfica", "Villarreal", "RB Salzburg", "Chelsea"};
        String[] B = {"Manchester City", "Liverpool", "Ajax Amsterdam", "Real Madryt", "Bayern Monachium", "Manchester United", "Lille", "Juventus"};
        MyQueue queue = new MyQueue();
        for (int i = 0; i < A.length-1; i+=2) {
            queue.put(new Element(A[i]));
            queue.put(new Element(A[i+1]));
            queue.put(new Element(B[i]));
            queue.put(new Element(B[i+1]));
        }
        queue.show();
        for (int i = 0; i < A.length; i++) {
            queue.get();
            queue.get();
        }
        queue.show();
    }
}
