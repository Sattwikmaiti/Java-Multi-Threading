package Observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private int initialStockdata;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setData(int stockCount) {
//all was empty so we need to notify observers
        // if(initialStockdata==0)
        // {
        //     notifyObservers();
        // }
      
        initialStockdata = initialStockdata+ stockCount;
        notifyObservers();

  
}

    @Override
    public void getData() {
        System.out.println("Pants.()"+initialStockdata); 
    }


    
}
