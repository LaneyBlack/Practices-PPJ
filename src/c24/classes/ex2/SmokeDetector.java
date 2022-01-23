package c24.classes.ex2;

public class SmokeDetector {
    private boolean hasSmoke;

    public SmokeDetector(boolean hasSmoke) {
        this.hasSmoke = hasSmoke;
    }

    public void check() throws Alarm {
        if (hasSmoke){
            throw new Alarm();
        } else {
            System.out.println("Everything is fine.");
        }
    }

    public boolean hasSmoke() {
        return hasSmoke;
    }

    public void setSmoke(boolean hasSmoke) {
        this.hasSmoke = hasSmoke;
    }
}
