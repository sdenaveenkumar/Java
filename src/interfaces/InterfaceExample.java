package interfaces;

interface Test{
    void method();
    void method2();
}

class Test2 implements Test{
    public void method() {
        System.out.println("Test method 1");
    }

    public void method2() {
        System.out.println("Test method 2");
    }

    public void method3() {
        System.out.println("Test 2 method");
    }
}

public class InterfaceExample {
    static void main() {
        Test2 t = new Test2();
        t.method();
        t.method2();
        t.method3();
    }
}
