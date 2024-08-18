package factory_method.concrete_creator;

import factory_method.concrete_product.WindowButton;
import factory_method.creator_abstract.SystemRender;
import factory_method.product_interface.Button;

public class WindowSystem extends SystemRender {

    @Override
    protected Button createButton() {
        return new WindowButton();
    }
}
