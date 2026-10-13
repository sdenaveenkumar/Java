package method_Over_Ride;

class Super{
    public void display(){
        System.out.println("super class display");
    }
}
//extends
class Sub extends Super{
    public void display() {
        System.out.println("sub class display");
    }
}

public class Overriding {
    static void main() {
        //object of the Super reference class
        Super su = new Super();
        su.display();

        //object of the Sub reference class
        Sub sub = new Sub();
        sub.display();

        //creating object of the Sub class on the reference of Super class
        Super sb = new Sub();
        sb.display();

    }
}
