

// package LocksDemo;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantDemo {

    public static void main(String[] args) {
        //if true new ReentrantLock(true); ,then fair policy applied
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        lock.lock();
        /*
         * lock.lock()  // Main thread gets this lock
         * lock.lock()   // since it is reentrant,same thread can get lock any number of times . 
         * lock.getHoldCount()==2
         * 
         */
        try{
           
        System.out.println(lock.isFair());
        //number of locks hold by the jvm 
        System.out.println(lock.getHoldCount());
      //whether lock is locked or not 
        System.out.println(lock.isLocked());
          //whether the lock is held by current thread or not
        System.out.println(lock.isHeldByCurrentThread());
        //how many other threads are waiting for the lock
        System.out.println(lock.getQueueLength());
        //true if any other threads are waiting in queue
        System.out.println(lock.hasQueuedThreads());
       
       
        }
        finally{
            lock.unlock();
            System.out.println("---------------");
            System.out.println(lock.getHoldCount());
            System.out.println(lock.isLocked());
            System.out.println(lock.isHeldByCurrentThread());
            System.out.println(lock.getQueueLength());
            System.out.println(lock.hasQueuedThreads());
        }
    }

    
}
