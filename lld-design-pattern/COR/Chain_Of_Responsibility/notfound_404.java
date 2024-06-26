package COR.Chain_Of_Responsibility;

public class notfound_404  extends Logger{

    public notfound_404(Logger logger) {
        super(logger); // Call the superclass constructor
    }
        public void logMessage(int level, String message)
        {
            System.out.println("Entered in NotfoundLOOGER  -->>"+level);
               
             System.out.println("Exit in NotFoundLOOGER  -->>"+level);
                   
                
        }
    
}
