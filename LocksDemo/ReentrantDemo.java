

package LocksDemo;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantDemo {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{
           
        System.out.println(lock.isFair());
        System.out.println(lock.getHoldCount());
        System.out.println(lock.isLocked());
        System.out.println(lock.isHeldByCurrentThread());
        System.out.println(lock.getQueueLength());
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
