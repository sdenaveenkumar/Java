package abstract_class;

abstract class Shape{
   abstract public double perimeter();
   abstract public double area();
}

//Rectangle class
class Rectangle extends Shape{
    public int length;
    public int breadth;

    //Constructor
    public Rectangle(int length, int bredth) {
        this.length = length;
        this.breadth = bredth;
    }
    //mathod
    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }
    //method
    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape{
    double r;

    public Circle(int r) {
        this.r = r;
    }
    public double perimeter() {
        return 2*Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

public class Challenge_Shape {
    static void main() {

        // object of Rectangle
        Shape Rectangle = new Rectangle(10,5);
        double perimeter_of_Rectangle = Rectangle.perimeter();
        double area_of_Rectangle = Rectangle.area();
        //print
        System.out.println("Perimeter: "+ perimeter_of_Rectangle);
        System.out.println("Area: "+ area_of_Rectangle);

        // Object of Circle
        Shape Circle = new Circle(5);
        double perimeter_of_Circle = Circle.perimeter();
        double area_of_circle = Circle.area();
        //print
        System.out.println("Perimeter: "+ Math.round(perimeter_of_Circle));
        System.out.println("Area: " + Math.round(area_of_circle));






    }
}
