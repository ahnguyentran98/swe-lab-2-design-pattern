import abstract_factory.abstract_class.GUIFactory;
import abstract_factory.concrete_factory.IphoneFactory;
import abstract_factory.concrete_factory.PixelFactory;

public class Main {
    public static void main(String[] args) {
        // Abstract factory
        ClientApplication iPhoneApplication = new ClientApplication(new IphoneFactory());
        iPhoneApplication.render();

        ClientApplication pixelApplication = new ClientApplication(new PixelFactory());
        pixelApplication.render();
    }
}