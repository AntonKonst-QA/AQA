package Practice_2.Builder_1;

public class Order {
    private String product;
    private int discount;
    private String paymentMethod;

    public Order(OrderBuilder builder) {
        this.product = builder.product;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }

    @Override
    public String toString(){
        return "Товар: " + product +
                ", скидка: " + discount +
                ", способ оплаты: " + paymentMethod;
    }
}
