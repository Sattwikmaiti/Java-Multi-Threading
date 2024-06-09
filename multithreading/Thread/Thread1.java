package Thread;

       //extending java.lang.Thread class (Thread1)
public class Thread1 extends Thread {
//super constructor is called to pass the name of the thread
    public Thread1(String name) {
        super(name);
    }
    @Override

    public void run() {
       System.out.println("Thread1 is running..."+Thread.currentThread());
    }
    
}
