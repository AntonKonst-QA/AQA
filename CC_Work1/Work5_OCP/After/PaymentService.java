package Work5_OCP.After;

public class PaymentService {
    private PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void execute(double amount) {
        processor.processPayment(amount);
    }
}
