package Work5_OCP.After;

public class Bitcoin implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
