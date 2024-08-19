package abstract_factory;

import abstract_factory.abstract_class.Button;
import abstract_factory.abstract_class.CheckBox;
import abstract_factory.abstract_class.GUIFactory;

public class AbstractFactoryClientApplication {

/*    Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It allows a system to be independent of how its objects are created, composed, and represented.
    Key points about Abstract Factory:
    It encapsulates object creation logic.
    It provides a way to create families of related objects.
    It promotes loose coupling between client code and concrete implementations.*/

    private Button button;
    private CheckBox checkBox;

    public AbstractFactoryClientApplication(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void render(){
        button.render();
        checkBox.render();
    }
}
