package factory_method;

import factory_method.concrete_creator.MacSystem;
import factory_method.concrete_creator.WindowSystem;
import factory_method.creator_abstract.SystemRender;

public class ClientApplication {
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
