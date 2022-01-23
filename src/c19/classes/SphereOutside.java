package c19.classes;

public class SphereOutside {
    private double radius;
    private Cylinder cylinder = null;
    private Cube cube = null;

    public SphereOutside(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public SphereOutside(Cube cube) {
        this.cube = cube;
    }

    public void show () {
        if (cube != null) {
            radius = cube.getSide() * Math.sqrt(2) / 2;
            System.out.println("Radius  of the sphere outside the cube is " + radius);
        }
        if (cylinder!=null) {
            if (cylinder.getHeight() > cylinder.getRadius())
                radius = cylinder.getHeight() * Math.sqrt(2) / 2;
            else
                radius = cylinder.getRadius() * Math.sqrt(2) / 2;
            System.out.println("Radius  of the sphere outside the cylinder is " + radius);
        }
    }
}
