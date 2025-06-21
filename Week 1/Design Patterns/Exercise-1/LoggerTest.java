class LoggerTest {
    public static void main(String[] args) {
        // Attempt to get two instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Logging from both instances
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verifying both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
