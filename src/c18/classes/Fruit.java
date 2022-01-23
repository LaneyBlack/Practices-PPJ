package c18.classes;

public class Fruit {
    public String name;
    public double weight;

    public Fruit (String name) {
        this.name = name;
        this.weight = 0.5 + (((int)(Math.random()*100))*0.3)/100;
    }
    public void show () {
        System.out.println(name + " " + weight + "g");
    }
}
