package memento.memento;


public class Originator {
    
    public String state;
    
    public Originator(String state)
    {
        this.state = state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public Memento createMemento() {
        return new Memento(state);
    }
    
    public void restoreMemento(Memento memento) {
        if(memento != null)
        this.state = memento.state;
        else this.state=null;
    }
}