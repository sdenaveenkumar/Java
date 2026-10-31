package inner_classes;

//outer class
class Outer{
    int x = 10;

    //inner class
    class Inner{
        int y = 20;

        void innerDisplay() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    //method of Outer class which creates object of inner class and use innerDisplay() method
    void OuterDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class Introduction {
    static void main() {
        //create object of Outer class to use it
        Outer outer = new Outer();
        outer.OuterDisplay();
        //can create object of Inner class
        Outer.Inner inner = new Outer().new Inner();
        inner.innerDisplay();
    }
}
