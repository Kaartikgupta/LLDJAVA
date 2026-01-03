package main.java.com.lld.payment_system;

public class PayPayment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethods creditCard = new CreditCard("1234-5678-9012-3456");
        PaymentResult result = paymentProcessor.process(creditCard, 500.0);
        System.out.println(result.getMessage());

        PaymentMethods upi = new UPI("alpha@upi");
        PaymentResult result1 = paymentProcessor.process(upi,500.0);
        System.out.println(result1.getMessage());
    }
}
