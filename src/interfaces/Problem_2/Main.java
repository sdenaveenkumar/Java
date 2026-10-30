package interfaces.Problem_2;

//Problem 2: Pluggable Strategy Pattern with Interfaces
/*Objective: Use an interface to decouple the payment execution mechanism from the checkout cart,
             allowing payment strategies to be swapped at runtime without altering cart logic.*/

public class Main {
    static void main() {
        ShoppingCart newCart = new ShoppingCart();

        // Transactin 1: Paying with Credit card
        newCart.addItem(1399.00);
        newCart.addItem(499.00);
        PaymentStrategy CreditCard = new CreditCardPayment("1234567898765432");
        newCart.checkout(CreditCard);

        // Transaction 2: Paying with Upi
        newCart.addItem(299);
        PaymentStrategy upi = new UpiPayment("naveen@upi");
        newCart.checkout(upi);

        // Transaction 3: Paying with Wallet
        newCart.addItem(100);
        PaymentStrategy wallet = new WalletPayment(10000);
        newCart.checkout(wallet);

    }
}
