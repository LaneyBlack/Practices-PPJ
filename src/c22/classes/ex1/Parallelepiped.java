package c22.classes.ex1;

public class Parallelepiped extends Rectangle {
    private int lengthH;

    public Parallelepiped(int lengthA, int lengthB, int lengthH) {
        super(lengthA, lengthB);
        this.lengthH = lengthH;
    }

    @Override
    public int surfaceArea (){
        return (2*super.getLengthA()*lengthH + 2*super.getLengthB()*lengthH + 2*super.surfaceArea());
    }

    public int getLengthH() {
        return lengthH;
    }

    public void setLengthH(int lengthH) {
        this.lengthH = lengthH;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " lengthH=" + lengthH;
    }
}
