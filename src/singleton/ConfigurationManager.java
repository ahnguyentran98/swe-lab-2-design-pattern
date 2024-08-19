package singleton;

public enum ConfigurationManager {

/*    The Singleton pattern is a design pattern that restricts the instantiation of a class to a single instance.
        This is useful when exactly one object is needed to coordinate actions across the system.
        The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.

    Characteristics of the Singleton Pattern:
    Single Instance: The class ensures that only one instance of the class exists.
    Global Access: The instance can be accessed globally.
    Lazy Initialization: The instance is created only when it's needed.*/

    INSTANCE;

    private String databaseUrl;
    private String apiKey;

    // Initialize configuration settings (could be loaded from a file, etc.)
    ConfigurationManager() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/defaultdb";
        this.apiKey = "default-key";
    }

    // Getter for database URL
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    // Setter for database URL
    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    // Getter for API key
    public String getApiKey() {
        return apiKey;
    }

    // Setter for API key
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void displayConfiguration() {
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }
}
