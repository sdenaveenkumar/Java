package interfaces.Problem_2;

public class ShoppingCart {
    private double totalAmount = 0.0;

    public void addItem(double price) {
        if (price > 0){
            totalAmount += price;
            System.out.println("Added item worth ₹" + price + ". Current Total: ₹" + totalAmount);
        }
    }

    public void totalAmount() {
        System.out.println("total amout of cart is : " + totalAmount);;
    }

    public void checkout(PaymentStrategy strategy) {
        if( totalAmount <= 0) {
            System.out.println("Cart is empty! Nothing to pay.");
            return;
        }

        System.out.println("\nInitiating Checkout for total: " + totalAmount);
        strategy.pay(totalAmount);
        totalAmount = 0.0;
    }
}
