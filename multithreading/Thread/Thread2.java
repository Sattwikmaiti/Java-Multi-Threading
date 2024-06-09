package Thread;
 //implementing java.lang.Runnable interface (Thread2)

public class Thread2 implements Runnable {
    
   
    @Override

    public void run() {
       System.out.println("Thread2 is running..."+Thread.currentThread());
    }
}
