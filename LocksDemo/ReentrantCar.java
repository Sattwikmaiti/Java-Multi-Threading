package LocksDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantCar {

    ReentrantLock lock = new ReentrantLock(true);


    public void drive(String name) throws InterruptedException
    {
        try {

            lock.lock();

            for(int i=1;i<=5;i++)
            {
                System.out.println(name+" is driving the car");
                Thread.sleep(3000);
            }
            
            
        } finally {

            lock.unlock();
        }

      
    }

    public void performTryLock(String name) throws InterruptedException {
        boolean isLockAcquired = false;
        try {
            System.out.println(name + " Who is trying to acquire lock--> " + Thread.currentThread().getName());
           isLockAcquired = lock.tryLock(2, TimeUnit.SECONDS);
           System.out.println("Get Queue --"+lock.getQueueLength());
           System.out.println("has Queue --"+lock.hasQueuedThreads());
            if (isLockAcquired) {
                // critical section
                System.out.println("Lock acquired by " + Thread.currentThread().getName());
                for (int i = 1; i <= 5; i++) {
                    System.out.println(name + " is driving the car");
                    Thread.sleep(3000);
                }
            } else {
                System.out.println("Lock could not be acquired by " + Thread.currentThread().getName());
            }
            System.out.println("Run by " + Thread.currentThread().getName());
        } finally {
            if (isLockAcquired) {
                lock.unlock();
            }
        }
    }
    


    public void performTryLockSimple() throws InterruptedException {
        boolean isLockAcquired = lock.tryLock(2, TimeUnit.SECONDS);
        if (isLockAcquired) {
            // critical section
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Lock to be unlocked by " + Thread.currentThread().getName());
            lock.unlock();
        } else {
            System.out.println("Lock could not be acquired by " + Thread.currentThread().getName());
        }
        System.out.println("Run by " + Thread.currentThread().getName());
    }

    
}
