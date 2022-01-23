package c19.classes;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder (int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void show () {
        System.out.println("Cylinder height = " + height + ", radius = " + radius);
        System.out.println("Cylinder base area = " + area());
        System.out.println("Cylinder volume = " + volume());
    }

    public double area () {
        return Math.pow(radius,2)*3.14;
    }
    public double volume () {
        return area()*height;
    }


    public int getHeight() {
        return height;
    }
    public int getRadius() {
        return radius;
    }
}
