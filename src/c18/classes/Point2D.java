package c18.classes;

public class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] get() {
        return new int[]{x, y, 1};
    }

    public void set(int[] arr) {
        x = arr[0];
        y = arr[1];
    }

    public void show() {
        System.out.println(x + " " + y);
    }
}
