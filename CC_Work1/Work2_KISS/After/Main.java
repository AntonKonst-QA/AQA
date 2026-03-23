package Work2_KISS.After;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        double result = discountCalculator.calculateDiscount(100, true, true, true);

        System.out.println("Цена с учетом скидки: " + result);
    }
}
