package c24.classes.ex1;

public class FruitTree extends Tree {
    private String fruitName;

    public FruitTree(String name, int radius, int height, String fruitName) {
        super(name, radius, height);
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "FruitName{" +
                "fruitName='" + fruitName + '\''
                + super.toString() + "}";
    }
}
