package c19.classes;

public class Jar {
    private Jam jam;
    private boolean isOpened;

    public Jar(Jam jam) {
        this.jam = jam;
        this.isOpened = false;
    }

    public void show() {
        System.out.println("Jar jam flavour: " + jam.getFlavour() + ", weight : " + jam.getWeight());
    }

    public void openJar () {
        isOpened = true;
        System.out.println("Jar is opened");
    }

    public void closeJar () {
        isOpened = true;
        System.out.println("Jar is closed");
    }

    public boolean isOpened () {
        return isOpened;
    }

}
