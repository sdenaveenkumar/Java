package method_Over_Ride;

class Car{
    void start() {
        System.out.println("Car Started!");
    }
    void accelerate() {
        System.out.println("Car Accelerated!");
    }
    void changeGear() {
        System.out.println("Car gear changed!");
    }
}
class LuxuryCar extends Car{
    void changeGear() {
        System.out.println("Luxury car gear changed!");
    }
    void openRoof() {
        System.out.println("Luxury car roof opened!");
    }
}
public class CarExample {
    static void main() {
    Car car = new LuxuryCar();
    car.start();
    car.accelerate();
    car.changeGear();
    //car.openRoof();
    }
}
