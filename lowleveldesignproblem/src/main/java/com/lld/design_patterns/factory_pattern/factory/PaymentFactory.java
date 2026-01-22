package main.java.com.lld.design_patterns.factory_pattern.factory;

import main.java.com.lld.design_patterns.factory_pattern.paymentMain.PaymentMethod1;
import main.java.com.lld.design_patterns.factory_pattern.paymentMain.impl.CashPayment;
import main.java.com.lld.design_patterns.factory_pattern.paymentMain.impl.CreditCardPayment;

public class PaymentFactory {
    public PaymentMethod1 createPaymentMethod(String type){
        if(type.equals("CreditCard")){
            return new CreditCardPayment();
        }
        if(type.equals("CashPayment")){
            return new CashPayment();
        }
        else {
            throw new IllegalArgumentException("Invalid payment method type");
        }
    }
}
