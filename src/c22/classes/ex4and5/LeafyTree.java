package c22.classes.ex4and5;

public class LeafyTree extends Tree{
    private String leafForm;

    public LeafyTree( int height, double diameter, String leafForm) {
        super(false, height, diameter);
        this.leafForm = leafForm;
    }

    public String getLeafForm() {
        return leafForm;
    }

    public void setLeafForm(String leafForm) {
        this.leafForm = leafForm;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " leafForm=" + leafForm;
    }
}
