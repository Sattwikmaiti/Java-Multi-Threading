package COR.Chain_Of_Responsibility;

public class Info extends Logger {
      
    public Info(Logger logger) {
        super(logger); // Call the superclass constructor
    }
     
     public void logMessage(int level, String message)
     {
        System.out.println("Entered in INFOLOOGER  -->>"+level);
            if(level==INFO)
            {
                 System.out.println("Info: " + message);
            }
            else
            {
                System.out.println("Exiting from INFOLOGGER To next Logger "+level);

                 nextLogger.logMessage(level, message);
            }
     }
    
}
