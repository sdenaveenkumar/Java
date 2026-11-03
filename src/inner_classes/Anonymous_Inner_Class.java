package inner_classes;

abstract class My{
    public abstract void display();
}

class Outer_Class {
    public void method() {
        My m = new My() {
            @Override
            public void display() {
                System.out.println("display");
            }
        };
        m.display();
    }
}

public class Anonymous_Inner_Class {
    static void main() {
        Outer_Class out = new Outer_Class();
        out.method();
    }
}
