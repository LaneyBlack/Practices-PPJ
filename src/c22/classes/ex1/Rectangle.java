package c22.classes.ex1;

public class Rectangle {
    private int lengthA;
    private int lengthB;

    public Rectangle(int lengthA, int lengthB) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    public int surfaceArea (){
        return lengthA*lengthB;
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getLengthB() {
        return lengthB;
    }

    public void setLengthB(int lengthB) {
        this.lengthB = lengthB;
    }

    @Override
    public String toString() {
        return "lengthA=" + lengthA +
                ", lengthB=" + lengthB;
    }
}
