package main.java.com.lld.design_patterns.factory_pattern.app;

import main.java.com.lld.design_patterns.factory_pattern.factory.PaymentFactory;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.createPaymentMethod("CashPayment").pay1(100);
        paymentFactory.createPaymentMethod("CreditCard").pay1(200);
    }

}
