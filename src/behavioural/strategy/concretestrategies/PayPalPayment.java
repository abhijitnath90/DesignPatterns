package behavioural.strategy.concretestrategies;

import behavioural.strategy.strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs " +amount+ " using PayPal: "+email);
    }
}
