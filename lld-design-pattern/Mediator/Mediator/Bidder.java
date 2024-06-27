package Mediator.Mediator;

public class Bidder implements Participant{

    String name;
    AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }
    
    @Override
    public void placebid(int bidamount) {
        mediator.placeBid(this, bidamount);

    }


    @Override
    public void receivenotification(int bidamount) {
        System.out.println("Notification for "+name+" : New bid of amount "+bidamount+" has been placed");
    }

    @Override
    public String getName() {
        return name;
    }

}
