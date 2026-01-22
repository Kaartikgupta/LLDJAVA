package main.java.com.lld.design_patterns.factory_pattern.paymentMain.impl;

import main.java.com.lld.design_patterns.factory_pattern.paymentMain.PaymentMethod1;

public class CreditCardPayment implements PaymentMethod1 {
    @Override
    public void pay1(double amount){
        System.out.println("Credit Card Payment - " + amount);
    }
}
