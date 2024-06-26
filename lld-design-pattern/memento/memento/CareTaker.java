package memento.memento;

import java.util.ArrayList;
import java.util.List;
public class CareTaker {

    List<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }
  
    public Memento Undo()
    {
        if(!mementos.isEmpty())
        {
            Memento memento = mementos.get(mementos.size() - 1);
            mementos.remove(mementos.size() - 1);
            return memento;
        }
        return null;
    }

    
}
