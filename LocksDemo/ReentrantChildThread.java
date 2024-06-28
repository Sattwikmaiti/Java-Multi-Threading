package LocksDemo;

public class ReentrantChildThread extends Thread {
//ReentrantChildThread has-a ReentrantCar and is-a Thread
    ReentrantCar c;
    String name;

   
    public ReentrantChildThread( ReentrantCar c, String name) {
        super(name);//in thread class , the name of thread gets set
        this.c = c;
        this.name = name;
        
    }

    @Override
    public void run()
    {
        try {
            c.performTryLock(name);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
}
