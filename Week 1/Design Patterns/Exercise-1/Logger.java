public class Logger {

    // Step 2: Private static instance
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Step 2: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Sample method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

