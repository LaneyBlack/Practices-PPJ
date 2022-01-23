package c18;

import c18.classes.*;

public class c18 {
    public static void main(String[] args) {
        System.out.println("----------------------------Ex.1----------------------------");
        Person person = new Person("Anton", "Reut", 2004);
        person.show();
        System.out.println(person.toString());
        System.out.println("----------------------------Ex.2----------------------------");
        Fruit fruit = new Fruit("Banana");
        fruit.show();
        System.out.println("----------------------------Ex.3----------------------------");
        Balloon balloon1 = new Balloon(9,0.007);
        Balloon balloon2 = new Balloon(6,0.007);
        System.out.println(balloon1.getLoad() + "kg");
        System.out.println(balloon2.getLoad() + "kg");
        Donkey donkey = new Donkey(0.09);
        donkey.addBalloon(balloon1);
        donkey.addBalloon(balloon2);
        if (donkey.isFlying())
            System.out.println("I am flying!!!");
        else
            System.out.println("Still on the ground :(");
        System.out.println("----------------------------Ex.5----------------------------");
        Point2D point2D = new Point2D(3,5);
        point2D.show();

        for (int i: point2D.get())
            System.out.println(i + "\t");
        System.out.println();

        point2D.set(new int[]{2,3,1});

        point2D.show();

        for (int v : point2D.get())
            System.out.print(v + "\t");
        System.out.println();
    }
}
