package c19;

import c19.classes.*;

import java.util.Scanner;

import static c19.classes.User.getOldest;
import static c19.classes.User.returnOlder;
import static functions.Functions.arrayPrint;

public class c19 {
    public static void main(String[] args) {
        System.out.println("------------------------------Ex1------------------------------");
        Cube cube = new Cube(4);
        cube.show();
        System.out.println("------------------------------Ex2------------------------------");
        Cylinder cylinder = new Cylinder(2, 6);
        cylinder.show();
        System.out.println("------------------------------Ex3------------------------------");
        SphereIn sphereIn1 = new SphereIn(cube);
        sphereIn1.show();
        SphereIn sphereIn2 = new SphereIn(cylinder);
        sphereIn2.show();
        System.out.println("------------------------------Ex4------------------------------");
        SphereOutside sphereOutside1 = new SphereOutside(cube);
        sphereOutside1.show();
        SphereOutside sphereOutside2 = new SphereOutside(cylinder);
        sphereOutside2.show();
        System.out.println("------------------------------Ex5------------------------------");
        User user1 = new User("John", 1998);
        User user2 = new User("Smith", 2002);
        User user3 = new User("Polina", 2000);
        User user4 = new User("Alex", 1985);
        returnOlder(user1,user2).show();
        returnOlder(user3,user4).show();
        User[] users = {user1,user2,user3,user4};
        getOldest(users).show();
        System.out.println("------------------------------Ex6------------------------------");
        Jam blueberryJam = new Jam("Blueberry");
        blueberryJam.show();
        Jam blackberryJam = new Jam("Blackberry", 150);
        blackberryJam.show();
        Jam unknownJam = new Jam(240);
        unknownJam.show();
        System.out.println("------------------------------Ex6------------------------------");
        Jar jar1 = new Jar(blueberryJam);
        jar1.show();
        System.out.println("Is jar opened? - " + jar1.isOpened());
        jar1.openJar();
        System.out.println("Is jar opened? - " + jar1.isOpened());
        jar1.closeJar();
        System.out.println("Is jar opened? - " + jar1.isOpened());
    }
}
