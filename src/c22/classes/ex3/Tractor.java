package c22.classes.ex3;

public class Tractor extends WheeledVehicle {
    private double weight;

    public Tractor(String color, int numberOfAxes, double weight) {
        super(color, numberOfAxes);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void ridingTest () {
        if((weight/super.getNumberOfAxes())>11)
            System.out.println("Riding is not safe. Cannot start the engine");
        else
            System.out.println("Riding is safe. Starting engine");
    }

    @Override
    public String toString() {
        return super.toString() + " weight=" + weight;
    }
}
