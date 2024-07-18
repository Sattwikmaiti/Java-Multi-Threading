
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ConditionLock{
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean conditionMet = false;

    public void await() throws InterruptedException {
        
        lock.lock();
        try {
            while (!conditionMet) {
                condition.await();
            }
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        lock.lock();
        try {
            conditionMet = true;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ConditionLock conditionLock = new ConditionLock();
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Locking....");
                conditionLock.await();
                Thread.sleep(2000);
                System.out.println("Condition met");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Unlocking....");
             
                conditionLock.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}