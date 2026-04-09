package Practice_2.Builder_1;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setProduct("Молоко")
                .setDiscount(10)
                .setPaymentMethod("Credit Card")
                .build();
        System.out.println(order);
    }
}
