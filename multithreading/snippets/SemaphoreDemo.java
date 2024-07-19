
import java.util.concurrent.Semaphore;
public class SemaphoreDemo{

private Semaphore semaphore=new Semaphore(4);

public void doSomething() throws InterruptedException{
   
 
    try{
        System.out.println("Thread "+Thread.currentThread().getName()+" tried to acquire semaphore"+"Availabe "+ semaphore.availablePermits());

        semaphore.acquire();
        System.out.println("Thread "+Thread.currentThread().getName()+" is doing something"+"Availabe "+ semaphore.availablePermits());
        Thread.sleep(3000);
    }catch(InterruptedException e)
    {
        System.err.println(Thread.currentThread() +"Failed");
        e.printStackTrace();
    }
    finally{
        System.out.println("Thread "+Thread.currentThread().getName()+" released semaphore"+"Availabe "+ semaphore.availablePermits());

        semaphore.release();
       
    }

   
}


public static void main(String[] args) {
    SemaphoreDemo semo=new SemaphoreDemo();

    for(int i=0;i<10;i++){
        Thread t=new Thread(
        //     new Runnable(){
        //     public void run(){
        //         try{
        //             semo.doSomething();
        //         }catch(InterruptedException e){
        //             e.printStackTrace();
        //         }
        //     }
        // }
        ()->{
            try{
                            semo.doSomething();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }

        }
        );
        t.start();
    }


    
}


}