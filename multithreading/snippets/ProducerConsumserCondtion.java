

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumserCondtion {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Queue<Integer> queue=new LinkedList<>();
    private final int capacity=2;
private static boolean runnable=true;
    public void produce() throws InterruptedException {
        
        int value = 0;
        while (runnable) {
         
            lock.lock();
            System.out.println("Producer has lock");
            try {
              
                while (queue.size() == capacity) {

                    System.out.println("condition produced await");
                    condition.await();
                    System.out.println("condition produced successfull");
                }

                Thread.sleep(3000);
                System.out.println("Producing value: " + value);
                queue.add(value++);
                condition.signal();
            } finally {
                lock.unlock();
                System.out.println("Producer gave away lock");
            }
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        while (runnable) {
            lock.lock();
            System.out.println("Consumer has lock");
            try {

                while (queue.isEmpty()) {
                    System.out.println("condition consumer await");
                    condition.await();
                    System.out.println("condition consumer successfull");
                }
                Thread.sleep(3000);
                int value = queue.poll();
                System.out.println("Consuming value: " + value);
                condition.signal();
            } finally {
                lock.unlock();
                System.out.println("Consumer gave away lock");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumserCondtion producerConsumserCondtion = new ProducerConsumserCondtion();
        Thread t1 = new Thread(() -> {
            try {
                producerConsumserCondtion.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                producerConsumserCondtion.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread.sleep(3000);
        t2.start();

   


    }


}