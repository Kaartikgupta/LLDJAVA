package main.java.com.lld.rule_engine;

import java.util.Optional;

public interface ExpenseRule {
    Optional<Violation> evaluate(Expense expense);
}
