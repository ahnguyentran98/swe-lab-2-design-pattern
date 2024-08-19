package builder.builder_interface;

import builder.product_class.Pizza;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}
