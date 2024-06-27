package Command.Command;

public class ConcreteCommandOff implements CommandInterface{

    private Receiver receiver;
    
    public ConcreteCommandOff(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
    
}
