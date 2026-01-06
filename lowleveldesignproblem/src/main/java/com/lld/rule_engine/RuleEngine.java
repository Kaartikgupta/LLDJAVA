package main.java.com.lld.rule_engine;

import java.util.*;
import java.util.stream.Collectors;

public class RuleEngine {

    private final List<ExpenseRule> expenseRules;
    private final List<TripRule> tripRules;

    public RuleEngine(List<ExpenseRule> expenseRules,
                      List<TripRule> tripRules) {
        this.expenseRules = expenseRules;
        this.tripRules = tripRules;
    }

    public List<Violation> evaluate(List<Expense> expenses) {
        List<Violation> violations = new ArrayList<>();

        // Expense-level rules
        for (Expense expense : expenses) {
            for (ExpenseRule rule : expenseRules) {
                rule.evaluate(expense).ifPresent(violations::add);
            }
        }

        // Trip-level rules
//        Map<String, List<Expense>> expensesByTrip =
//                expenses.stream()
//                        .collect(Collectors.groupingBy(Expense::getTripId));
//
//        for (List<Expense> tripExpenses : expensesByTrip.values()) {
//            for (TripRule rule : tripRules) {
//                violations.addAll(rule.evaluate(tripExpenses));
//            }
//        }

        return violations;
    }
}
