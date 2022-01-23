package c24.classes.ex1;

public class Tree {
    private String name;
    private int radius;
    private int height;

    public Tree(String name, int radius, int height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", radius=" + radius +
                ", height=" + height;
    }
}
