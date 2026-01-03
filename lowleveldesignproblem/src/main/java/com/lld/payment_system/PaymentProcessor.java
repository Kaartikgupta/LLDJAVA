package main.java.com.lld.payment_system;

public class PaymentProcessor {
    public PaymentResult process(PaymentMethods paymentMethods, Double amount) {
        return paymentMethods.pay(amount);
    }
}
