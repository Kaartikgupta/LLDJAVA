package main.java.com.lld.design_patterns.solid_principals.discount_calculator;

public class PriceCalculator {
    private final DiscountType discountType;
    public PriceCalculator(DiscountType type) {
        this.discountType = type;
    }
    public double calculatePrice(double amount) {
        return discountType.calculateDiscount(amount);
    }
}
