package Observer.Observer;

public interface Observable {


     
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setData(int data);

    void getData();

    
}
