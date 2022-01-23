package c22.classes.ex4and5;

public class ConiferousTree extends Tree {
    private int numberOfNeedles;
    private double lengthOfCone;

    public ConiferousTree(int height, double diameter, int numberOfNeedles, double lengthOfCone) {
        super(true, height, diameter);
        this.numberOfNeedles = numberOfNeedles;
        this.lengthOfCone = lengthOfCone;
    }

    public int getNumberOfNeedles() {
        return numberOfNeedles;
    }

    public void setNumberOfNeedles(int numberOfNeedles) {
        this.numberOfNeedles = numberOfNeedles;
    }

    public double getLengthOfCone() {
        return lengthOfCone;
    }

    public void setLengthOfCone(double lengthOfCone) {
        this.lengthOfCone = lengthOfCone;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " numberOfNeedles=" + numberOfNeedles +
                ", lengthOfCone=" + lengthOfCone;
    }
}
