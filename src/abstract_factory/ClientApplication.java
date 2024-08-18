package abstract_factory;

import abstract_factory.abstract_class.Button;
import abstract_factory.abstract_class.CheckBox;
import abstract_factory.abstract_class.GUIFactory;

public class ClientApplication {
    private Button button;
    private CheckBox checkBox;

    public ClientApplication(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void render(){
        button.render();
        checkBox.render();
    }
}
