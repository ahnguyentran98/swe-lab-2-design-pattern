package builder;

import builder.builder_interface.PizzaBuilder;
import builder.concrete_builder.HawaiiPizzaBuilder;
import builder.concrete_builder.SpicyPizzaBuilder;
import builder.director_class.Waiter;
import builder.product_class.Pizza;

public class ClientApplication {

    /*The Builder pattern is a creational design pattern that allows you to construct complex objects step by step. It's especially useful when an object needs to be created with numerous possible configuration options.
    Key points about the Builder pattern:

    It separates the construction of a complex object from its representation.
    It allows the same construction process to create different representations.
    It's useful when an object has a large number of optional parameters or configuration options.*/
    public void getPizza(){
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiiPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println("First order: " + pizza);

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        pizza = waiter.getPizza();
        System.out.println("Second order: " + pizza);
    };
}
