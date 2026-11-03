package inner_classes;

interface My_Class{
    public void show();
}
//outer class
class Outerss{
    static int x = 5;
    int y = 10;

    public void display() {
        //create new anonymous class and use the show method as well
        new My_Class(){public  void show(){
            System.out.println("display");}}.show();
    }
    //static inner class
    static class InnerClass{
        public void add() {
            System.out.println(x + 10);
        }
    }

}

public class Practice {
    static void main() {
        //create object of outer class
        Outerss O = new Outerss();
        O.display();
        //create object of inner class withou creating object on outer class
        Outerss.InnerClass OI = new Outerss.InnerClass();
        OI.add();
    }
}
