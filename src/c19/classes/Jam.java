package c19.classes;

public class Jam {
    private String flavour;
    private double weight;

    public Jam (String flavour) {
        this.flavour = flavour;
        this.weight = 100.;
    }
    public Jam (double weight) {
        this.flavour = "No name";
        this.weight = weight;
    }
    public Jam (String flavour,double weight) {
        this.flavour = flavour;
        this.weight = weight;
    }

    public void show() {
        System.out.println("Jam flavour: " + flavour + ", weight : " + weight);
    }

    public double getWeight() {
        return weight;
    }

    public String getFlavour() {
        return flavour;
    }
}
