package main.java.com.lld.design_patterns.solid_principals.discount_calculator;

public class SeasonalDiscount implements DiscountType {
    @Override
    public double calculateDiscount(double amount) {
        // Seasonal discount logic, e.g., 15% discount
        return amount * 0.15;
    }
}
