package COR.Chain_Of_Responsibility;

public class Error extends Logger{
    public Error(Logger logger) {
        super(logger); // Call the superclass constructor
    }
     public void logMessage(int level, String message)
     {
        System.out.println("Entered in ErrorLOOGER  -->>"+level);
            if(level==ERROR)
            {
                 System.out.println("Error: " + message);
            }
            else
            {
                System.out.println("Exit in errorLOOGER  -->>"+level);
                 nextLogger.logMessage(level, message);
            }
     }
    
}
