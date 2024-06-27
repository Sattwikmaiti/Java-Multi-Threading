package Command.Command;

public class Main{

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoke invoker = new Invoke();
        ConcreteCommandOn concreteCommandOn = new ConcreteCommandOn(receiver);
        ConcreteCommandOff concreteCommandOff = new ConcreteCommandOff(receiver);
        
        
        invoker.setCommand(concreteCommandOn);
        invoker.executeCommand();
        invoker.setCommand(concreteCommandOn);
        invoker.executeCommand();
        
        
      invoker.undo();
      invoker.undo();
      
    }

}