package main.java.com.lld.rule_engine;

public class Expense {
    private final String expenseId;
    private final String tripId;
    private final int amount;
    private final ExpenseType expenseType;
    private final VendorType vendorType;

    public Expense(String expenseId, String tripId, int amount, ExpenseType expenseType, VendorType vendorType) {
        this.expenseId = expenseId;
        this.tripId = tripId;
        this.amount = amount;
        this.expenseType = expenseType;
        this.vendorType = vendorType;
    }
    public String getExpenseId() {
        return expenseId;
    }
    public String getTripId() {
        return tripId;
    }
    public int getAmount() {
        return amount;
    }
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    public VendorType getVendorType() {
        return vendorType;
    }
}
