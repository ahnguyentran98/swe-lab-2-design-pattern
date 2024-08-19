package singleton;

public class SingletonClientApplication {
    public void use(){
        ConfigurationManager config = ConfigurationManager.INSTANCE;
        config.displayConfiguration();

        config.setDatabaseUrl("jdbc:mysql://localhost:3306/anotherdatabase");
        config.setApiKey("67890-ZYXWV");

        System.out.println("\nModified Configuration:");
        config.displayConfiguration();
    }
}
