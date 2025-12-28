package main.java.com.lld.bank_account;

public class BankApp {
    public static void main(String[] args) {
        Account account1 = new Account("123456", AccountType.SAVINGS,1000.0);
        Account account2 = new Account("123457", AccountType.CURRENT,1000.0);
        Customer customer = new Customer("John Doe");
        customer.addAccount(account1);
        customer.addAccount(account2);

        customer.depositInAccount("123456", 500.0);
        customer.withdrawInAccount("123457", 200.0);
        customer.getAccount().forEach(account ->
                System.out.println(
                        account.getAccountNumber() + " | " +
                                account.getAccountType() + " | " +
                                account.getBalance()
                )
        );

    }
}
