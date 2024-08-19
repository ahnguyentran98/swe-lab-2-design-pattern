package builder.concrete_builder;

import builder.builder_interface.PizzaBuilder;
import builder.product_class.Pizza;

public class SpicyPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public SpicyPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void buildDough() {
        pizza.setDough("thick");
    }
    public void buildSauce() {
        pizza.setSauce("hot");
    }
    public void buildTopping() {
        pizza.setTopping("pepperoni and jalapeno");
    }
    public Pizza getPizza() {
        return this.pizza;
    }
}
