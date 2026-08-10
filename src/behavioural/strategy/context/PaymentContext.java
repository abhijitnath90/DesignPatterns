package behavioural.strategy.context;

import behavioural.strategy.strategy.PaymentStrategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(double amount) {
        if(strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }
}
