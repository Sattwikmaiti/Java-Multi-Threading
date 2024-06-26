package COR.Chain_Of_Responsibility;

public abstract  class Logger {

    public static int INFO = 1;
    public static int ALERT = 2;
    public static int ERROR = 3;

    Logger nextLogger; 

    public Logger(Logger logger)
    {
        this.nextLogger = logger;
    }
    
    public void logMessage(int level, String message)
    {
        if (this.nextLogger != null)
        {
            this.nextLogger.logMessage(level, message);
        }
    }
}
