package abstract_class;

abstract class Super{
    void method() {
        System.out.println("super method 1");
    }

    public Super() {
        System.out.println("constructor called");
    }

    abstract void method2();
}

class Sub extends Super{
    void method2() {
        System.out.println("sub method 2");
    }
}

public class AbstractExample {
    static void main() {
        Super s1 = new Sub();
        s1.method();
        s1.method2();
    }
}
