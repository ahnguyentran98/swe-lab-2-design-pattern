package factory_method.concrete_product;

import factory_method.product_interface.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Mac button");
    }
}
