package OOPs;

class Circle{
    public int radius;

    void area() {
        System.out.println(Math.PI * radius * radius);
    }

    double perimeter(int radius) {
        double result = 2 * Math.PI * radius;
        System.out.println(result);
        return result;
    }

     double circumference() {
        return perimeter(radius);
    }
}

public class Circle1 {
    static void main() {
        Circle c = new Circle();
        Circle c2 = new Circle();
        c.radius = 4;
        c2.radius= 5;
        //print
        c.area();
        c.perimeter(c.radius);
        c.circumference();

        c2.area();
        c2.perimeter(c2.radius);
        c2.circumference();
    }
}
