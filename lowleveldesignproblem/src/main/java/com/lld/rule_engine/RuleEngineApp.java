package main.java.com.lld.rule_engine;

import java.util.List;

public class RuleEngineApp {
    public static void main(String[] args) {

        List<Expense> expenses = List.of(
                new Expense("E1", "T1", 100, ExpenseType.RESTAURANT, VendorType.EXTERNAL),
                new Expense("E3", "T2", 50, ExpenseType.AIRFARE, VendorType.EXTERNAL),
                new Expense("E4", "T2", 40, ExpenseType.ENTERTAINMENT, VendorType.INTERNAL)
        );

        RuleEngine engine = new RuleEngine(List.of(new AirfareRule(), new RestaurantRule()), List.of());

        List<Violation> violations = engine.evaluate(expenses);

        violations.forEach(System.out::println);
    }
}
