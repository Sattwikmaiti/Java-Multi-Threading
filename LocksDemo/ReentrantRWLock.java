import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReentrantRWLock
{

    private Map<Integer, Integer> schedules= new HashMap<Integer, Integer>();
	private final ReadWriteLock rwLock=new ReentrantReadWriteLock(true);
	private final Lock readLock=rwLock.readLock();
	private final Lock writeLock= rwLock.writeLock();
     





                public void reader(Integer flight) throws InterruptedException {

                    readLock.lock();
                    
                    try{
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread()+" Reading schedule for"+flight+" --> "+ schedules.get(flight));
                    }
                    finally{
                        System.out.println(Thread.currentThread()+" Reading hogaya");
                        readLock.unlock();

                    }

                }

                public void writer(Integer flight, Integer time) throws InterruptedException {

                    writeLock.lock();
                    try{
                        Thread.sleep(1000);
                        schedules.put(flight,time);
                        System.out.println(Thread.currentThread()+" Writing schedule for"+flight+" --> "+ schedules.get(flight));
                    }
                    finally{
                        System.out.println(Thread.currentThread()+" Writing hogaya");
                        writeLock.unlock();

                    }

                }


                public static void main(String args[])
               {
                     ReentrantRWLock rw = new ReentrantRWLock();



                     for(int i=1;i<=10;i++)
                     {
                        
                        int t1=i;
                            Thread t = new Thread(new Runnable(){
                                public void run()
                                {
                                    try{
                                        rw.reader(t1);
                                    }
                                    catch(InterruptedException e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            t.start();
                     }
                     
                        for(int i=1;i<=10;i++)
                        {
                            int t2=i;
                                Thread t = new Thread(new Runnable(){
                                    public void run()
                                    {
                                       
                                        try{
                                            rw.writer(t2,1);
                                        }
                                        catch(InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                                t.start();
                        }
               }
    

}