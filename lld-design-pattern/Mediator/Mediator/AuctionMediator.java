package Mediator.Mediator;

public interface AuctionMediator {
    public void add(Participant participant);
    public void placeBid(Participant participant, int bidAmount);
    
}
