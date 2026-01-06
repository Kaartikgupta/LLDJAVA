package main.java.com.lld.rule_engine;

public class AirfareRule {
    public boolean validateExpense(Expense expense) {
        if (expense.getExpenseType() != ExpenseType.AIRFARE) {
            return false;
        }
        // Airfare specific validation logic
        if (expense.getAmount() <= 0) {
            return false;
        }
        // Additional rules can be added here

        return false;
    }
}
