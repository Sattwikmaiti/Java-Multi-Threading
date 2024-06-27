package Observer.Observer;

public class ConcreteObserver  implements Observer{

    private String email;
    private Observable observable;

    public ConcreteObserver(String email,Observable observable) {
        this.email = email;
        this.observable = observable;
        
    }

    @Override
    public void update() {
       sendmail(email, "Product is available now");
    }
     

    private void sendmail(String email,String message)
    {
        System.out.println("Email sent to "+email+" with message "+message);
    }
}
