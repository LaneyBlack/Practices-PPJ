package c22.classes.ex4and5;

public class Tree {
    private boolean alwaysGreen;
    private int height;
    private double diameter;

    public Tree(boolean alwaysGreen, int height, double diameter) {
        this.alwaysGreen = alwaysGreen;
        this.height = height;
        this.diameter = diameter;
    }

    public boolean isAlwaysGreen() {
        return alwaysGreen;
    }

    public void setAlwaysGreen(boolean alwaysGreen) {
        this.alwaysGreen = alwaysGreen;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tree " +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", diameter=" + diameter;
    }
}
