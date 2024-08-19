package strategy.concrete;

import strategy.strategy_interface.PaymentStrategy;

public class ATMPayment implements PaymentStrategy {
    private String atmCardNumber;

    public ATMPayment(String atmCardNumber) {
        this.atmCardNumber = atmCardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using ATM Card: " + atmCardNumber);
    }
}
