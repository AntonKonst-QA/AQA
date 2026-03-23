package Work5_OCP.After;

public class PayPal implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
