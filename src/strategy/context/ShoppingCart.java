package strategy.context;

import strategy.strategy_interface.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Method to set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to execute the payment using the chosen strategy
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
