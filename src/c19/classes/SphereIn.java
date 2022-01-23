package c19.classes;

public class SphereIn {
    private double radius;
    private Cylinder cylinder = null;
    private Cube cube = null;

    public SphereIn(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public SphereIn(Cube cube) {
        this.cube = cube;
    }

    public void show() {
        if (cube != null) {
            radius = cube.getSide() / 2;
            System.out.println("Radius  of the sphere inside the cube is " + radius);
        }
        if (cylinder != null) {
            if (cylinder.getHeight() > cylinder.getRadius())
                radius = cylinder.getRadius() / 2;
            else
                radius = cylinder.getHeight();
            System.out.println("Radius of the sphere inside the cylinder is " + radius);
        }
    }
}
