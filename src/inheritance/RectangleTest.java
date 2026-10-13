package inheritance;
//parametrize constructor
class Rectangle{
    int l;
    int b;
    int x = 10;

    public Rectangle(){
        System.out.println("parent class");
        l = 1;
        b= 1;
    }

    public Rectangle(int l) {
        this.l = l;
    }

    public Rectangle(int l, int b) {
        System.out.println("2 para constructore parent");
        this.l = l;
        this.b = b;
    }

    public int area() {
        return  l * b;
    }
}

class Cuboid extends Rectangle{
    int h;
    int x = 30;
    public Cuboid() {
        System.out.println("child class");
        h = 1;
    }

    public Cuboid(int h) {
        this.h = h;
    }

    public Cuboid(int l,int b, int h){
        System.out.println("2 para child");
        super(l,b);
        this.h = h;
    }

    public int area() {
        return  l * b * h;
    }

    void display() {
        System.out.println(x);
        System.out.println(super.x * 3);
    }
}

public class RectangleTest {
     static void main() {
        Rectangle r = new Rectangle(6,3);
        int answer = r.area();
        Cuboid c = new Cuboid(6,3,2);
        int result = c.area();
        c.display();
        System.out.println(result);
        System.out.println(answer);
    }
}
