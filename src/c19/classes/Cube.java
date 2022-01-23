package c19.classes;

public class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public void show() {
        System.out.println("Square side = " + side);
        System.out.println("Square side area = " + area());
        System.out.println("Square volume = " + volume());
    }

    public int area () {
        return side*side;
    }

    public int volume() {
        return area()*side;
    }

    public int getSide() {
        return side;
    }
}
