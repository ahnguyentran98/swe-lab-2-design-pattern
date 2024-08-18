package factory_method.creator_abstract;

import factory_method.product_interface.Button;

public abstract class SystemRender {
    public void renderSystem(){
        Button button = createButton();
        button.render();
    }
    protected abstract Button createButton();
}
