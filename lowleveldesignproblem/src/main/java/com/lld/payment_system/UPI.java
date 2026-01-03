package main.java.com.lld.payment_system;

public class UPI implements PaymentMethods{

    private String upiId;
    public UPI(String upiId){
        this.upiId = upiId;
    }

    @Override
    public PaymentResult pay(double amount) {
        if(amount <= 0) return new PaymentResult(false, "Invalid amount");
        else
            return new PaymentResult(true,"Paid " + amount + " using UPI from UPI ID: " + upiId);
    }
}
