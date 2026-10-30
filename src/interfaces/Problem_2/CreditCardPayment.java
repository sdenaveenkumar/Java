package interfaces.Problem_2;

public class CreditCardPayment implements PaymentStrategy {
        private final String cardNumber;

        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }
        @Override
        public void pay(double amount) {
            String lastFourDigits = (cardNumber != null && cardNumber.length() >= 4) ? cardNumber.substring(cardNumber.length() - 4) : "XXXX";
            System.out.println("paid " + amount + " using Credit Card ending with " + lastFourDigits);
        }
    }


