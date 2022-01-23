package c22.classes.ex3;

public class Vehicle {
    private String color;

    @Override
    public String toString() {
        return "Vehicle" +
                " color=" + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(String color) {
        this.color = color;
    }
}
