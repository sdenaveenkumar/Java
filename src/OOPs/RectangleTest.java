package OOPs;

class Rectangle{
    private int length;
    public int breadth;

    public Rectangle() {

    }

    public Rectangle(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2*(length + breadth);
    }

    public int getLength(){
        return length;
    }

    public void setLength(int l) {
        length = l;
    }


}

public class RectangleTest {

    static void main() {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.breadth = 5;
        int area = r.area();
        int perim = r.perimeter();

        Rectangle r1 = new Rectangle(10);
        r1.setLength(20);
        System.out.println(area);
        System.out.println(perim);
        System.out.println(r.getLength());

        System.out.println("r2 area: " + r1.area());
    }
}
