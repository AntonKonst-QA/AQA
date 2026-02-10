package Work2_KISS.After;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

        if (isLoyalCustomer && isFirstPurchase) {
            return price * 0.10;
        }
        if (isLoyalCustomer) {
            return price * 0.05;
        }
        if (hasCoupon) {
            return price * 0.07;
        }
        return price * 0.02;
    }
}
