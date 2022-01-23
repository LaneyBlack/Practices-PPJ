package с23.classes.ex1;

public class Fruit {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRandomWeight(int from, int to){
        setWeight(Math.random()*(to-from) + from);
    }
}
