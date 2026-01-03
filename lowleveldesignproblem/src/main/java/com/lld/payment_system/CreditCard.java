package main.java.com.lld.payment_system;

public class CreditCard implements PaymentMethods{
    public String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public PaymentResult pay(double amount) {
        if(amount <= 0) return new PaymentResult(false, "Invalid amount");
        else
            return new PaymentResult(true,"Paid " + amount + " using Credit Card from card number: " + cardNumber);
    }
}
