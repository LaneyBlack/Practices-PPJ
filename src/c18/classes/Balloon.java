package c18.classes;

public class Balloon {
    public int size;
    public double density;

    public Balloon (int size, double density) {
        this.size = size;
        this.density = density;
    }

    public double getLoad () {
        double weightToLoad = (size* density); //*100 cause in gramms
        return weightToLoad;
    }
}
