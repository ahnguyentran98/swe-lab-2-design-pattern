package builder.concrete_builder;

import builder.builder_interface.PizzaBuilder;
import builder.product_class.Pizza;

public class HawaiiPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiiPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void buildDough() {
        pizza.setDough("thin");
    }
    public void buildSauce() {
        pizza.setSauce("mild");
    }
    public void buildTopping() {
        pizza.setTopping("ham and pineapple");
    }
    public Pizza getPizza() {
        return this.pizza;
    }
}
