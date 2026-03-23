package Work5_OCP.After;

public class Main {
    public static void main(String[] args) {
        double orderAmount = 100.0;

        PaymentService service = new PaymentService(new CreditCard());
        service.execute(orderAmount);
    }
}
