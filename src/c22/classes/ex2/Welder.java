package c22.classes.ex2;

public class Welder extends Person {
    private int seniority;

    public Welder(String name, int seniority) {
        super(name);
        this.seniority = seniority;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Welder{" + super.toString() +
                ", seniority=" + seniority +
                '}';
    }
}
