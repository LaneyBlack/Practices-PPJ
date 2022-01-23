package c24.classes.ex3;

public class Rocket {
    private String name;
    private int fuelWeight;

    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }

    public void fuelRocket(int fuelWeight) {
        setFuelWeight(this.fuelWeight + fuelWeight);
    }

    public void start() throws Exception {
        if (this.fuelWeight<1000){
            throw new Exception("Not enough fuel to start. Abort mission!");
        } else {
            System.out.println("Mission started!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelWeight() {
        return fuelWeight;
    }

    public void setFuelWeight(int fuelWeight) {
        this.fuelWeight = fuelWeight;
    }
}
