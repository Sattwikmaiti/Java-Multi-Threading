package memento.memento;

public class Main {
    
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("State 1");
        
        System.out.println("Current State: " + originator.getState());
        
        careTaker.addMemento(originator.createMemento());
        
        originator.setState("State 2");
        
        System.out.println("Current State: " + originator.getState());
        
        careTaker.addMemento(originator.createMemento());
        
        originator.setState("State 3");
        
        System.out.println("Current State: " + originator.getState());
        
        careTaker.addMemento(originator.createMemento());
        
        originator.restoreMemento(careTaker.Undo());
        
        System.out.println("Current State: " + originator.getState());
        
        originator.restoreMemento(careTaker.Undo());
        
        System.out.println("Current State: " + originator.getState());
        
        originator.restoreMemento(careTaker.Undo());
        
        System.out.println("Current State: " + originator.getState());
        
        originator.restoreMemento(careTaker.Undo());
        if(originator.getState() == null)
            System.out.println("No more states to undo");
        else
        System.out.println("Current State: " + originator.getState());
    }
}
