package decorator.concrete_decorator;

import decorator.decorator_abstract_class.CoffeeDecorator;
import decorator.decorator_interface.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.2; // Adding sugar cost
    }
}
