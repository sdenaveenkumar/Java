package interfaces.Problem_2;

public class UpiPayment implements PaymentStrategy {
    private final String upiId;
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("paid : " + amount + " via UPI Id : " + upiId);
    }

}
