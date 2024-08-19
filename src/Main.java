import abstract_factory.AbstractFactoryClientApplication;
import abstract_factory.concrete_factory.IphoneFactory;
import abstract_factory.concrete_factory.PixelFactory;
import adapter.AdapterClientApplication;
import adapter.concrete_class.AudioPlayer;
import adapter.target_interface.MediaPlayer;
import factory_method.FactoryClientApplication;
import observer.ObserverClientApplication;
import singleton.ConfigurationManager;
import singleton.SingletonClientApplication;
import strategy.StrategyClientApplication;

public class Main {
    public static void main(String[] args) {
        /* 1.Abstract factory*/
//        AbstractFactoryClientApplication iPhoneApplication = new AbstractFactoryClientApplication(new IphoneFactory());
//        iPhoneApplication.render();
//
//        AbstractFactoryClientApplication pixelApplication = new AbstractFactoryClientApplication(new PixelFactory());
//        pixelApplication.render();


       /*  2.Factory method*/
//        FactoryClientApplication clientApplication = new FactoryClientApplication();
//        clientApplication.configureAndRunBusinessLogic();


       /* 3.Builder*/
//        ClientApplication clientApplication = new ClientApplication();
//        clientApplication.getPizza();

        /* 4.Singleton*/
//        SingletonClientApplication singletonClientApplication = new SingletonClientApplication();
//        singletonClientApplication.use();

        /* 5.Adapter*/
//        AdapterClientApplication adapterClientApplication = new AdapterClientApplication();
//        adapterClientApplication.use();

        /* 6.Strategy*/
//        StrategyClientApplication strategyClientApplication = new StrategyClientApplication();
//        strategyClientApplication.use();

        /* 7.Observer*/
        ObserverClientApplication observerClientApplication = new ObserverClientApplication();
        observerClientApplication.observer();

    }
}