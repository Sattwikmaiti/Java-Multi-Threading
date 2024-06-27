package Mediator.Mediator;

public class Main {

    public static void main(String[] args) {
        AuctionMediator mediator = new ConcreteAuction();
        Participant bidder1 = new Bidder("Bidder 1", mediator);
        Participant bidder2 = new Bidder("Bidder 2", mediator);
        Participant bidder3 = new Bidder("Bidder 3", mediator);
        System.out.println("Welcome to the Auction. The participants are: ");
        System.out.println("Bidder1 bade 1000");
        bidder1.placebid(1000);

         System.out.println("");
        bidder2.placebid(2000);
        bidder3.placebid(3000);
    }
    
}
