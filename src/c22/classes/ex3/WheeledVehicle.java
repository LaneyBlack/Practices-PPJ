package c22.classes.ex3;

public class WheeledVehicle extends Vehicle {
    private int numberOfAxes;

    public WheeledVehicle(String color, int numberOfAxes) {
        super(color);
        this.numberOfAxes = numberOfAxes;
    }

    @Override
    public String toString() {
        return  super.toString() + " numberOfAxes=" + numberOfAxes;
    }

    public int getNumberOfAxes() {
        return numberOfAxes;
    }

    public void setNumberOfAxes(int numberOfAxes) {
        this.numberOfAxes = numberOfAxes;
    }
}
