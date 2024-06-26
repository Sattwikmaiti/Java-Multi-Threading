package COR.Chain_Of_Responsibility;

public class Main {

    public static void main(String[] args) {
        //info-->Alert-->Error-->404-->null (404 means : none of the logger can handle the request)
        Logger logger = new Info(new Alert(new Error(new notfound_404(null))));
        
        // logger.logMessage(Logger.INFO, "This is an information.");
       // logger.logMessage(Logger.ALERT, "This is an alert.");
       logger.logMessage(6, "This is an error.");
    }
    
}
