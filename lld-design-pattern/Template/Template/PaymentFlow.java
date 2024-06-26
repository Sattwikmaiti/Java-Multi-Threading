package Template.Template;

public abstract class PaymentFlow{
    public abstract void validate();
    public abstract void debitAmount();
    public abstract void sendNotification();
    public abstract void calculateFees();
    public void thankuser(){
        System.out.println("Thank you for using our service");
    }
    //final making it not-overrriden by its extending child class
    public final void processPayment(){
        validate();
        debitAmount();
        sendNotification();
        calculateFees();
        thankuser();
    }

   
}