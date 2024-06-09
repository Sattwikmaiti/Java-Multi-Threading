package LocksDemo;

public class ReentrantChildThread extends Thread {

    ReentrantCar c;
    String name;

   
    public ReentrantChildThread( ReentrantCar c, String name) {
        super(name);
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
