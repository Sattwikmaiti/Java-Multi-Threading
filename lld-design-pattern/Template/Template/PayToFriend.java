package Template.Template;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validate() {
        System.out.println("Validating the payment");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting the amount from the account");
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification to the friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating the fees for the transaction: 0 fees for friends");
    }


    
    
   
    
}
