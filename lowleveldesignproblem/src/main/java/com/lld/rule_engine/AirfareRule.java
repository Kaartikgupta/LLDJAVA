package main.java.com.lld.rule_engine;

import java.util.Optional;

public class AirfareRule implements ExpenseRule{
    @Override
    public Optional<Violation> evaluate(Expense expense) {
        if (expense.getExpenseType() == ExpenseType.AIRFARE) {
            return Optional.of((new Violation("AirfareNotAllowed", "Invalid expense type for AirfareRule")));
        }

        return Optional.empty();
    }
}
