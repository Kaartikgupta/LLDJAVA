package main.java.com.lld.rule_engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RuleEngine {
    private final List<ExpenseRule> rules;
    private final List<TripRule> triprule;

    public RuleEngine(List<ExpenseRule> rules, List<TripRule> triprule) {
        this.rules = new ArrayList<>();
        this.triprule = new ArrayList<>();
    }

    public List<Violation> evaluate(Expense expenses) {
            List<Violation> violations = new ArrayList<>();

            for (Expense expense : expenses) {
                for (ExpenseRule rule : expenseRules) {
                    rule.evaluate(expense).ifPresent(violations::add);
                }
            }

            Map<String, List<Expense>> expensesByTrip =
                    expenses.stream()
                            .collect(Collectors.groupingBy(Expense::getTripId));

            for (List<Expense> tripExpenses : expensesByTrip.values()) {
                for (TripRule rule : tripRules) {
                    violations.addAll(rule.validate(tripExpenses));
                }
            }

            return violations;

    }

}
