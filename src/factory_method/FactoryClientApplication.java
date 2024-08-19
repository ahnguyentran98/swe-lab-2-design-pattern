package factory_method;

import factory_method.concrete_creator.MacSystem;
import factory_method.concrete_creator.WindowSystem;
import factory_method.creator_abstract.SystemRender;

public class FactoryClientApplication {

/*    The Factory Method is another creational design pattern, but it's simpler than the Abstract Factory. It defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
    Key points about Factory Method:

    It uses inheritance to delegate the responsibility of object instantiation to subclasses.
    It promotes loose coupling by eliminating the need to bind application-specific classes into the code.
    It provides a way to encapsulate object creation logic in a single place.*/
    
    public void configureAndRunBusinessLogic() {
        SystemRender systemRender;
        if (System.getProperty("os.name").equals("Windows 10")) {
            systemRender = new WindowSystem();
        } else {
            systemRender = new MacSystem();
        }

        systemRender.renderSystem();
    }
}
