package c24;

import c24.classes.ex1.FruitTree;
import c24.classes.ex1.NoFruitTree;
import c24.classes.ex1.Tree;
import c24.classes.ex2.Alarm;
import c24.classes.ex2.SmokeDetector;
import c24.classes.ex3.Rocket;

public class c24 {
    public static void main(String[] args) {
        System.out.println("-----------------------Ex1-----------------------");
        Tree[] forest = {
                new NoFruitTree("spruce", 2, 16, true),
                new NoFruitTree("christmas tree", 1, 9, true),
                new FruitTree("mango tree", 1, 11, "mango")
        };

        for (Tree val : forest) {
            System.out.println(val);
            try {
                getFruit(val);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("-----------------------Ex2-----------------------");
        SmokeDetector smokeDetector = new SmokeDetector(true);
        try {
            smokeDetector.check();
        } catch (Alarm alarm) {
            alarm.getMessage();
        }
        smokeDetector.setSmoke(false);
        try {
            smokeDetector.check();
        } catch (Alarm alarm) {
            alarm.getMessage();
        }

        System.out.println("-----------------------Ex3-----------------------");
        Rocket rocket = new Rocket("Appolon-2", 800);
        try {
            rocket.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        rocket.fuelRocket(800);
        try {
            rocket.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getFruit(Tree tree) throws Exception{
        if (tree.getClass() != FruitTree.class) {
            throw new Exception("This tree has no Fruit! ");
        }
        System.out.println(((FruitTree) tree).getFruitName());
    }
}
