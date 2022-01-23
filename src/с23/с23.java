package с23;

import с23.classes.ex1.Tree;
import с23.classes.ex2.MobilePhone;
import с23.classes.ex2.Person;
import с23.classes.ex2.Smartphone;

public class с23 {
    public static void main(String[] args) {
        System.out.println("-------------------------------Ex1-------------------------------");
        Tree tree = new Tree();
        double fruitsWeightSum = 0;
        while (fruitsWeightSum<5000){
            double weight = tree.getFruitFromTree().getWeight();
            fruitsWeightSum+=weight;
            System.out.print("+" + weight + " ");
        }
        System.out.println("\n Bag weight = " + fruitsWeightSum);
        System.out.println("-------------------------------Ex2-------------------------------");
        MobilePhone nokia = new MobilePhone("WindowsPhone","white");
        nokia.call("4553");
        nokia.call("4238");
        nokia.call("4787");
        nokia.call("4236");
        nokia.call("5236");
        nokia.call("7236");
        nokia.showCallsHistory();
        Smartphone samsung = new Smartphone("Android 11","black");
        samsung.call(new Person("Diana", "Sadovskaya","+375445131095"));
        samsung.call(new Person("Dina", "Samuel","+37544412452"));
        samsung.showFriendsList();
    }
}
