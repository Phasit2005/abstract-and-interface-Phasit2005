public class TestPayment {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.pay(1500.50);

        Payment payment2 = new BankTransferPayment();
        payment2.pay(2500.50);
    }
}
