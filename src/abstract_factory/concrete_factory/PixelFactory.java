package abstract_factory.concrete_factory;

import abstract_factory.abstract_class.Button;
import abstract_factory.abstract_class.CheckBox;
import abstract_factory.abstract_class.GUIFactory;
import abstract_factory.concrete_product.PixelButton;
import abstract_factory.concrete_product.PixelCheckBox;

public class PixelFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new PixelButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new PixelCheckBox();
    }
}
