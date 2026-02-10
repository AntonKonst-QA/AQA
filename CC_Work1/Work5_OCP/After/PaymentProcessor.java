package Work5_OCP.After;

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCard implements PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Оплата кредитной картой на сумму " + amount);
        }
}
class PayPal implements PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Оплата через PayPal на сумму " + amount);
        }
}
class Bitcoin implements PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Оплата Bitcoin на сумму " + amount);
        }
}
