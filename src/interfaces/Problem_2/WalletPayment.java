package interfaces.Problem_2;

public class WalletPayment implements PaymentStrategy {
    private double balance;

    public WalletPayment(double intialBalance) {
        this.balance = intialBalance;
    }

    public void pay( double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("paid : " + amount + " wallet! remainig balance : " + balance);
        }else {
            System.out.println("Transaction failed: Insufficient balance in wallet. (Available : " + balance + " )");
        }
    }

    public double getBalance(){
        return balance;
    }
}
