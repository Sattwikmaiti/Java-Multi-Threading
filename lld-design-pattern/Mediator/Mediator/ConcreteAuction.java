package Mediator.Mediator;
import java.util.ArrayList;
import java.util.List;

public class ConcreteAuction implements AuctionMediator{

    List<Participant> participants = new ArrayList<Participant>();



    @Override
    public void add(Participant participant) {
        participants.add(participant);
    }
    @Override
    public void placeBid(Participant participant, int bidAmount) {
        for(Participant p: participants){
            //notify all other participants except bidder
            if(!p.getName().equals(participant.getName())){
                p.receivenotification(bidAmount);
            }
        }
    }
    
}
