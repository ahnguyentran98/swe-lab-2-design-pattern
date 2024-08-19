package strategy;

import strategy.concrete.ATMPayment;
import strategy.concrete.CreditCardPayment;
import strategy.concrete.QRCodePayment;
import strategy.context.ShoppingCart;

public class StrategyClientApplication {

  /*  The Strategy pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one as a separate class,
    and make them interchangeable. The key idea is that the client can choose an algorithm (or "strategy") at runtime without altering the code that uses the algorithm.

    Key Points:
    Context: The class that uses a strategy object. It interacts with the strategy interface and delegates the algorithm's execution to the strategy object.
    Strategy Interface: An interface common to all supported algorithms.
    This interface allows the context to execute the algorithm without knowing the specifics of the implementation.
    Concrete Strategies: Classes that implement the strategy interface. Each class provides a different implementation of the algorithm.*/
    public void use(){
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Pay using ATM Card
        cart.setPaymentStrategy(new ATMPayment("9876-5432-1098-7654"));
        cart.checkout(200);

        // Pay using QR Code
        cart.setPaymentStrategy(new QRCodePayment("QR123456789"));
        cart.checkout(300);
    }
}
