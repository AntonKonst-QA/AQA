package Work5_OCP.After;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new CreditCard();

        payment.processPayment(100.0);
    }
}
