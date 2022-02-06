package c22;

import c22.classes.ex1.Parallelepiped;
import c22.classes.ex1.Rectangle;
import c22.classes.ex2.Welder;
import c22.classes.ex3.Tractor;
import c22.classes.ex4and5.ConiferousTree;
import c22.classes.ex4and5.FruitTree;
import c22.classes.ex4and5.LeafyTree;
import c22.classes.ex4and5.Tree;

public class c22 {
    public static void main(String[] args) {
        System.out.println("----------------------------Ex1----------------------------");
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle.surfaceArea());
        Parallelepiped parallelepiped = new Parallelepiped(4,6,2);
        System.out.println(parallelepiped.surfaceArea());
        System.out.println("----------------------------Ex2----------------------------");
        Welder welder = new Welder("Vasya", 22);
        System.out.println(welder);
        welder.setName("Ilya");
        System.out.println(welder);
        System.out.println("----------------------------Ex3----------------------------");
        Tractor tractor = new Tractor("red", 3, 22);
        System.out.println(tractor);
        tractor.ridingTest();
        tractor.setWeight(33);
        tractor.ridingTest();
        tractor.setWeight(35);
        tractor.ridingTest();
        System.out.println("----------------------------Ex4-5----------------------------");
        Tree tree = new Tree(false,17,2.5);
        ConiferousTree spruce = new ConiferousTree(15, 2.5, 9, .45);
        LeafyTree maple = new LeafyTree(12, 1.1, "Canada");
        FruitTree appleTree = new FruitTree(17, 2.5, "usual", "apple");
        System.out.println(spruce);
        System.out.println(maple);
        System.out.println(appleTree);
    }
}
