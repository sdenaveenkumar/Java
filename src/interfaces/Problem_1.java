package interfaces;

//Problem 1: Multiple Interfaces & Default Method Conflict (Diamond Problem).
/*Goal: Practice resolving multiple inheritance conflicts when two interfaces define
        the same default method signature.*/

interface Flyable{
    void fly();
    default void land() {
        System.out.println("Landing on runway!");
    }
}

interface Swimmable{
    void swim();
    default void land() {
        System.out.println("Landing on water!");
    }
}

class Seaplane implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Seaplane is flying high!");
    }
    @Override
    public void swim() {
        System.out.println("Seaplane is Swimming!");
    }
    @Override
    public void land() {
        Flyable.super.land();
        Swimmable.super.land();
        System.out.println("Seaplane is fully stopped");
    }
}

public class Problem_1 {
    static void main() {
        Seaplane mySeaPlane = new Seaplane();
        mySeaPlane.fly();
        mySeaPlane.swim();
        mySeaPlane.land();
    }
}
