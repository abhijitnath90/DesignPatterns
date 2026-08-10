package behavioural.strategy;

import behavioural.strategy.concretestrategies.CreditCardPayment;
import behavioural.strategy.concretestrategies.PayPalPayment;
import behavioural.strategy.concretestrategies.UpiPayment;
import behavioural.strategy.context.PaymentContext;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        //Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.payAmount(1500);

        //Switching to UPI
        context.setPaymentStrategy(new UpiPayment("abhijitnath@upi"));
        context.payAmount(800);

        //Switching to PayPal
        context.setPaymentStrategy(new PayPalPayment("abhijitnath@gmail.com"));
        context.payAmount(2000);
    }
}
