package behavioural.strategy.concretestrategies;

import behavioural.strategy.strategy.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs " +amount+ " using UPI: " +upiId);
    }
}
