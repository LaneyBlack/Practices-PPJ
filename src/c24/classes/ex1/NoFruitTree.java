package c24.classes.ex1;

public class NoFruitTree extends Tree {
    private boolean alwaysGreen;

    public NoFruitTree(String name, int radius, int height, boolean alwaysGreen) {
        super(name, radius, height);
        this.alwaysGreen = alwaysGreen;
    }

    public boolean isAlwaysGreen() {
        return alwaysGreen;
    }

    public void setAlwaysGreen(boolean alwaysGreen) {
        this.alwaysGreen = alwaysGreen;
    }

    @Override
    public String toString() {
        return "NoFruitTree{" +
                "alwaysGreen=" + alwaysGreen +
                super.toString() +
                '}';
    }
}
