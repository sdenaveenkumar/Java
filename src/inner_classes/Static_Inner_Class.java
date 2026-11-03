package inner_classes;

class Outers{
    int x = 5;
    static int y = 10;

    // static inner class
    static class Inner{
       public void methods() {
            //only static variable can be accessible
            System.out.println(y);
        }
    }
}

public class Static_Inner_Class {
    static void main() {
        //object creation of inner class with refrence of outer class
        Outers.Inner outer = new Outers.Inner();
        outer.methods();
    }
}
