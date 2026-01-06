package main.java.com.lld.rule_engine;

import java.util.List;

public interface TripRule {
    List<Violation> evaluate(Expense expense);
}
