package main.java.com.lld.bank_account;

public class BankApp {
    public static void main(String[] args) {
        Account account = new Account("123456", 1000.0);
        Customer customer = new Customer("John Doe", account);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccountNumber().getAccountNumber());
        System.out.println("Initial Balance: $" + customer.getAccountNumber().getBalance());

        customer.getAccountNumber().deposit(500.0);
        System.out.println("Balance after deposit: $" + customer.getAccountNumber().getBalance());

        boolean success = customer.getAccountNumber().withdraw(2200.0);
        if (success) {
            System.out.println("Balance after withdrawal: $" + customer.getAccountNumber().getBalance());
        } else {
            System.out.println("Withdrawal failed due to insufficient funds.");
        }
    }
}
