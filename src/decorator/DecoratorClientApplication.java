package decorator;

import decorator.concrete_component.BlackCoffee;
import decorator.concrete_decorator.MilkDecorator;
import decorator.concrete_decorator.SugarDecorator;
import decorator.decorator_interface.Coffee;

public class DecoratorClientApplication {
    public void serveCoffee(){
        // Order a black coffee
        Coffee blackCoffee = new BlackCoffee();
        System.out.println(blackCoffee.getDescription() + " $" + blackCoffee.cost());

        // Add milk to the black coffee
        blackCoffee = new MilkDecorator(blackCoffee);
        System.out.println(blackCoffee.getDescription() + " $" + blackCoffee.cost());

        Coffee blackCoffee_2 = new BlackCoffee();
        // Add sugar to the black coffee
        blackCoffee_2 = new SugarDecorator(blackCoffee_2);
        System.out.println(blackCoffee_2.getDescription() + " $" + blackCoffee_2.cost());
    }
}
