package LocksDemo;

public class ReentrantMain {
    
    public static void main(String args[])
    {

        ReentrantCar car = new ReentrantCar();

        ReentrantChildThread t1 = new ReentrantChildThread(car, "Thread1");
        ReentrantChildThread t2 = new ReentrantChildThread(car, "Thread2");
        t1.start();
        
        t2.start();

    }
}
