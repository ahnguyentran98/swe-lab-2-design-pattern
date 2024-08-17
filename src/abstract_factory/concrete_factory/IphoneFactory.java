package abstract_factory.concrete_factory;

import abstract_factory.abstract_class.Button;
import abstract_factory.abstract_class.CheckBox;
import abstract_factory.abstract_class.GUIFactory;
import abstract_factory.concrete_product.IphoneButton;
import abstract_factory.concrete_product.IphoneCheckBox;

public class IphoneFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new IphoneButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IphoneCheckBox();
    }
}
