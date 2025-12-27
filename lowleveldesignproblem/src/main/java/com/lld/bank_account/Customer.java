package main.java.com.lld.bank_account;

public class Customer {
    private  String name;
    private Account accountNumber;

    public Customer(String name, Account accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public Account getAccountNumber() {
        return accountNumber;
    }
}
