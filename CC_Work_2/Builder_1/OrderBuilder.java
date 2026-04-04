package Practice_2.Builder_1;

public class OrderBuilder {
    protected String product;
    protected int discount;
    protected String paymentMethod;

    public OrderBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public OrderBuilder setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public Order builder() {
        return new Order(this);
    }
}
