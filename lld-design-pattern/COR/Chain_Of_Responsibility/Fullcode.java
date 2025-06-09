
abstract class Logger {
    public static int INFO = 1;
    public static int ALERT = 2;
    public static int ERROR = 3;
    public static int NOT_FOUND_404 = 4;

    protected Logger nextLogger;

    public Logger(Logger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }
    }
}

// Info Logger class
class Info extends Logger {

    public Info(Logger logger) {
        super(logger);
    }

    @Override
    public void logMessage(int level, String message) {
        System.out.println("Entered in Info Logger -->> " + level);
        if (level == INFO) {
            System.out.println("Info: " + message);
        } else {
            System.out.println("Exit in Info Logger -->> " + level);
            super.logMessage(level, message);
        }
    }
}

// Alert Logger class
class Alert extends Logger {

    public Alert(Logger logger) {
        super(logger);
    }

    @Override
    public void logMessage(int level, String message) {
        System.out.println("Entered in Alert Logger -->> " + level);
        if (level == ALERT) {
            System.out.println("Alert: " + message);
        } else {
            System.out.println("Exit in Alert Logger -->> " + level);
            super.logMessage(level, message);
        }
    }
}

// Error Logger class
class Error extends Logger {

    public Error(Logger logger) {
        super(logger);
    }

    @Override
    public void logMessage(int level, String message) {
        System.out.println("Entered in Error Logger -->> " + level);
        if (level == ERROR) {
            System.out.println("Error: " + message);
        } else {
            System.out.println("Exit in Error Logger -->> " + level);
            super.logMessage(level, message);
        }
    }
}

// NotFound404 Logger class
class NotFound404 extends Logger {

    public NotFound404(Logger logger) {
        super(logger);
    }

    @Override
    public void logMessage(int level, String message) {
        System.out.println("Entered in NotFound Logger -->> " + level);
        if (level == NOT_FOUND_404) {
            System.out.println("404 Not Found: " + message);
        } else {
            System.out.println("Exit in NotFound Logger -->> " + level);
            super.logMessage(level, message);
        }
    }
}

// Demo class
public class Main {
    public static void main(String[] args) {
        // Set up the chain of responsibility
        Logger loggerChain = new Info(new Alert(new Error(new NotFound404(null))));

        // Test various log levels
        // loggerChain.logMessage(1, "This is an information message.");
        // loggerChain.logMessage(Logger.ALERT, "This is an alert message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
        // loggerChain.logMessage(Logger.NOT_FOUND_404, "This is a 404 not found message.");
    }
}
