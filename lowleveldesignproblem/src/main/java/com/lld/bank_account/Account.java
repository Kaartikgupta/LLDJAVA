package main.java.com.lld.bank_account;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountType accountType;

    public Account(String accountNumber, AccountType accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public  AccountType getAccountType() {return accountType;}

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else throw  new IllegalArgumentException("Insufficient funds or invalid amount");
    }
}
