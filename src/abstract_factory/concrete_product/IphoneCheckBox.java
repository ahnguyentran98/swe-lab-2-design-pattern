package abstract_factory.concrete_product;

import abstract_factory.abstract_class.CheckBox;

public class IphoneCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering Iphone check box");
    }
}
