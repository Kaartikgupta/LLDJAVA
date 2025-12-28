package main.java.com.lld.bank_account;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private  String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public List<Account> getAccount() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void depositInAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }

    public void withdrawInAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }

}
