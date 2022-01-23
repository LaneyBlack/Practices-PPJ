package с20.classes;

public class Corn {
    private int cornCount;

    public Corn (int cornCount) {
        this.cornCount = cornCount;
    }

    public Popcorn [] makePopcorn () {
        Popcorn [] popcorn = new Popcorn [(int)(Math.random()* cornCount)];
        for (int i = 0; i < popcorn.length; i++) {
            popcorn[i] = new Popcorn("Caramel");
        }
        return popcorn;
    }
}
