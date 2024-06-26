package COR.Chain_Of_Responsibility;

/*
The primary issue with your original Alert class is that it attempts to re-declare the nextLogger field, which is already inherited from the Logger superclass. This re-declaration shadows the inherited field and can lead to unexpected behavior. Additionally, the constructor in the Alert class doesn't explicitly call the constructor of the Logger superclass, leading to the error message about the undefined implicit super constructor.
 *  Logger nextLogger; // initially null

    public Alert(Logger logger) {
        this.nextLogger = logger;
    }
    is wrong 
 * 
 * 
 * 
 */
public class Alert extends Logger {

   
    public Alert(Logger logger) {
        super(logger); // Call the superclass constructor
    }
    public void logMessage(int level, String message) {
        System.out.println("Entered in alertLOOGER  -->>"+level);
        if (level == ALERT) {
            System.out.println("Alert: " + message);
        } else {
            System.out.println("Exit in alertLOOGER  -->>"+level);
            nextLogger.logMessage(level, message);
        }
    }

}
