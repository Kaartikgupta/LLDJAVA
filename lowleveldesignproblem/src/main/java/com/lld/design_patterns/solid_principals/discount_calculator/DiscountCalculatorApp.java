package main.java.com.lld.design_patterns.solid_principals.discount_calculator;


// this code demonstrate SRp, OCP, LSP, ISP and DIP principles
// Single Responsibility Principle: Each class has a single responsibility.
// Open/Closed Principle: The PriceCalculator class is open for extension (new discount types)
// but closed for modification (existing code doesn't need to change).
// Liskov Substitution Principle: Any subclass of DiscountType can be used in place of DiscountType without affecting the correctness of the program.
// Interface Segregation Principle: Clients (PriceCalculator) depend only on the methods they use (calculateDiscount).
// Dependency Inversion Principle: PriceCalculator depends on the abstraction (DiscountType) rather than concrete implementations(seasonaldiscount).
public class DiscountCalculatorApp {
    public static void main(String[] args) {
        DiscountType seasonalDiscount = new SeasonalDiscount();

        PriceCalculator priceCalculator = new PriceCalculator(seasonalDiscount);
        double originalPrice = 200.0;
        double finalPrice = priceCalculator.calculatePrice(originalPrice);
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Final Price after Seasonal Discount: $" + finalPrice);
    }
}
