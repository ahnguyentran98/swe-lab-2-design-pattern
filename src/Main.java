import abstract_factory.concrete_factory.IphoneFactory;
import abstract_factory.concrete_factory.PixelFactory;
import factory_method.ClientApplication;

public class Main {
    public static void main(String[] args) {
        // Abstract factory
//        ClientApplication iPhoneApplication = new ClientApplication(new IphoneFactory());
//        iPhoneApplication.render();
//
//        ClientApplication pixelApplication = new ClientApplication(new PixelFactory());
//        pixelApplication.render();


        // Factory method
        ClientApplication clientApplication = new ClientApplication();
        clientApplication.configureAndRunBusinessLogic();

    }
}