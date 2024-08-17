package abstract_factory.concrete_product;

import abstract_factory.abstract_class.CheckBox;

public class PixelCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering pixel checkbox");
    }
}
