



//https://leetcode.com/problems/the-dining-philosophers/description/
package org.example;

import java.time.LocalDateTime;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {





    public static class Dining{
        Semaphore[] forks;
        Semaphore philosophers;
       int len;

        public Dining(int n)
        { len=n;
            philosophers=new Semaphore(n,true);
            forks=new Semaphore[n];
               for(int i=0;i<n;i++) {
                forks[i]=new Semaphore(1,true);
            }
        }


        public void thinking()throws InterruptedException
        {
            Thread.sleep(100);
        }


        /// n philoshopers and forks . but acquire only if both are available . even then left first and right .. if odd then right then left
        /// concept of livelock  . to prevent it ..random timeout
        public void stimulate(int i) {
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("Thinking " + i + " " + LocalDateTime.now());

                try {
                    thinking();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted while thinking: " + i);
                    Thread.currentThread().interrupt();
                    break;
                }


                boolean firstAcquired = false;
                boolean secondAcquired = false;

                try {
                    // Acquire philosopher permit

                    System.out.println("Trying  acquired by " + i + " " + LocalDateTime.now());

                    Semaphore first = i%2==0 ?  forks[i] : forks[(i + 1) % len] ;
                    Semaphore second = i%2==0 ? forks[(i + 1) % len] : forks[i];


                    if(first.tryAcquire((long)(i+Math.random())*10, TimeUnit.MILLISECONDS))
                    {
                        firstAcquired=true;

                        if(second.tryAcquire((long)(i+Math.random())*10, TimeUnit.MILLISECONDS))
                        {
                            secondAcquired=true;
                            new pickLeftFork(i).run();
                            new pickRightFork(i).run();
                            System.out.println("Eating by " + i + " " + LocalDateTime.now());
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                break;
                            }
                            System.out.println("Finished eating by " + i + " " + LocalDateTime.now());

                        }else {
                            first.release();
                            firstAcquired=false;

                        }

                    }
                    // Eating






                } catch (InterruptedException e) {
                    System.out.println("Interrupted while acquiring semaphore: " + i);
                    Thread.currentThread().interrupt();
                    break;
                } finally {
                    // Release resources in reverse order of acquisition

                    Semaphore first = i%2==0 ?  forks[i] : forks[(i + 1) % len] ;
                    Semaphore second = i%2==0 ? forks[(i + 1) % len] : forks[i];

                    if (secondAcquired) {
                        second.release();
                        new putDownLeftFork(i).run();

                    }
                    if (firstAcquired) {
                        first.release();
                        new putDownRightFork(i).run();

                    }

                }
            }
        }


         // n-1 philosophers and n forks

        public void stimulate2(int i) {
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("Thinking " + i + " " + LocalDateTime.now());

                try {
                    thinking();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted while thinking: " + i);
                    Thread.currentThread().interrupt();
                    break;
                }

                boolean philosopherAcquired = false;
                boolean leftAcquired = false;
                boolean rightAcquired = false;

                try {
                    // Acquire philosopher permit
                    philosophers.acquire();
                    philosopherAcquired = true;
                    System.out.println("Lock acquired by " + i + " " + LocalDateTime.now());



                    Semaphore left = forks[i];
                    Semaphore right = forks[(i + 1) % len];

                    // Pick left fork
                    left.acquire();
                    leftAcquired = true;
                    new pickLeftFork(i).run();
                    System.out.println("Picked left fork by " + i + " " + LocalDateTime.now());

                    // Pick right fork
                    right.acquire();
                    rightAcquired = true;
                    new pickRightFork(i).run();
                    System.out.println("Picked right fork by " + i + " " + LocalDateTime.now());

                    // Eating
                    System.out.println("Eating by " + i + " " + LocalDateTime.now());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted while eating: " + i);
                        Thread.currentThread().interrupt();
                        break;
                    }
                    System.out.println("Finished eating by " + i + " " + LocalDateTime.now());

                } catch (InterruptedException e) {
                    System.out.println("Interrupted while acquiring semaphore: " + i);
                    Thread.currentThread().interrupt();
                    break;
                } finally {
                    // Release resources in reverse order of acquisition
                    if (rightAcquired) {
                        new putDownRightFork(i).run();
                        forks[(i + 1) % len].release();
                    }
                    if (leftAcquired) {
                        new putDownLeftFork(i).run();
                        forks[i].release();
                    }
                    if (philosopherAcquired) {
                        philosophers.release();
                        System.out.println("Lock released by " + i + " " + LocalDateTime.now());
                    }
                }
            }
        }


    }



    public static void main(String[] args)throws  InterruptedException {

          Dining dn=new Dining(2);

          Thread[] threads=new Thread[2];

          for(int i=0;i<2;i++) {
              final int id=i;
              threads[i] = new Thread(() -> {
                  try {

                      dn.stimulate(id);
                      Thread.sleep(1);
                  } catch (InterruptedException ex) {
                      Thread.currentThread().interrupt();



                  }

              });
          }

          for(int i=0;i<2;i++)
          {
              threads[i].start();


          }


        Thread.sleep(2000);

          for(int i=0;i<1;i++)
          {   System.out.println("Interurpitng " + i + LocalDateTime.now());
              threads[i].interrupt();
          }


    }
}

public class Dining {

    public static void main(String[] args) throws Exception {

        final Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            if (i == philosophers.length - 1) {

                // The last philosopher picks up the right fork first
                philosophers[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            Thread t
                    = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }

}
