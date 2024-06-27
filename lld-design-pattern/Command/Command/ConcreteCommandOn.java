package Command.Command;

public class ConcreteCommandOn implements CommandInterface {

    private Receiver receiver;
    
    public ConcreteCommandOn(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
    
}
