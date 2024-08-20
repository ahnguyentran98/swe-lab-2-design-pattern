package decorator.concrete_component;

import decorator.decorator_interface.Coffee;

public class BlackCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
