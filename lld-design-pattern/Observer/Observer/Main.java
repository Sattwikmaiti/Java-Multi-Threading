package Observer.Observer;

public class Main {
    
    public static void main(String[] args) {
          Observable ob1=new ConcreteObservable();
            Observer observer1=new ConcreteObserver("maiti@gmail.com",ob1);
            Observer observer2=new ConcreteObserver("kartik@gmail.com",ob1);
            ob1.addObserver(observer1);
            ob1.addObserver(observer2);
            ob1.setData(1);

            Observable ob2=new ConcreteObservable();
          
            Observer observer22=new ConcreteObserver("kritiktik@gmail.com",ob2);
          
            ob2.addObserver(observer22);
            ob2.setData(2);


    }
}
