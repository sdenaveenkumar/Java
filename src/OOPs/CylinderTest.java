package OOPs;

class Cylinder{
    private int radius;
    public int height;

    //getter for radius
    public int getRadius() {
        return radius;
    }
    //setter for radius
    public void setRadius(int radius) {
        if (radius < 0) {
            this.radius = 1;
        }else {
            this.radius = radius;
        }
    }
    //setter for both
    public void setDimension(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    //constructor
    public Cylinder() {
        radius = 1;
        height = 1;
    }
    //constructor
    public Cylinder(int height) {
        this.height = height;
    }
    //constructor
    public Cylinder(int height, int radius) {
        this.height = height;
        setRadius(radius);
    }
    //method
    public double area() {
        return Math.round(Math.PI * radius * height);
    }
}

public class CylinderTest {
    //main method
    static void main() {

        Cylinder c = new Cylinder();
        c.setDimension(4,6);
        double area = c.area();
        System.out.println(area);

    }
}
