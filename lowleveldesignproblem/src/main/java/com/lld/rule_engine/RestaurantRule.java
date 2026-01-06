package main.java.com.lld.rule_engine;

import java.util.Optional;

public class RestaurantRule implements ExpenseRule{
    @Override
    public Optional<Violation> evaluate(Expense expense) {
        // Example rule: Restaurant expenses must be below $100
        if (expense.getAmount() > 75) {
            return Optional.of(new Violation("RestaurantRule", "Invalid amount for RestaurantRule"));
        }
        else
            return Optional.empty();
    }
}
