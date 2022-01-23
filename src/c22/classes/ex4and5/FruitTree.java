package c22.classes.ex4and5;

public class FruitTree extends LeafyTree {
    private String fruitName;

    public FruitTree(int height, double diameter, String leafForm, String fruitName) {
        super(height, diameter, leafForm);
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
        return  super.toString()+
                " fruitName=" + fruitName;
    }
}
