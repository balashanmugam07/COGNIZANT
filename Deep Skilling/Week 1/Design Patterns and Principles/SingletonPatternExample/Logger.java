public class Logger {

    // Single instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}