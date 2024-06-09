package Thread;

public class ThreadTester {

    public static void main(String args[]) {

        // extending java.lang.Thread class (Thread1)
        Thread t1 = new Thread1("Thread1-og");
        t1.start();

        //implementing java.lang.Runnable interface (Thread2)
        Thread t2 = new Thread(new Thread2(), "Thread2-t2");

        t2.start();
        System.out.println("T2 threadname"+t2.getName());
        System.out.println("T2 thread is "+t2.isDaemon());


        Thread t3=new Thread1("Daemon thread");
        t3.setDaemon(true);
        t3.start();

// this lamda function will tell that .{ } is the implementation of run method . This will set the target to 
// this object and execute  it will create a class which implements the runnable interface . Inside the run method , 
// this function will be implemented.Then the object of this class will be created and the start method will be called on it.
        
     new Thread(()->{
            System.out.println("Thread4 using lamda function is running  is running..."+Thread.currentThread());
        },"Thread3").start();
        

    }

}
