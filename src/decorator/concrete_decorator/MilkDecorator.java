package decorator.concrete_decorator;

import decorator.decorator_abstract_class.CoffeeDecorator;
import decorator.decorator_interface.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5; // Adding milk cost
    }
}
