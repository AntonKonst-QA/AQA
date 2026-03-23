package Work5_OCP.After;

public class CreditCard implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
