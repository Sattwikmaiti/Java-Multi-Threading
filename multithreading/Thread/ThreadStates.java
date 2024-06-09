package Thread;

public class ThreadStates {


    public static void main(String args[])
    { 
        Thread thread=new Thread(()->
        {  
            try {

                Thread.sleep(1);

                for(int i=1;i<=10;i++)
                {
                    System.out.println("Thread is running"+i);
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           




        },"ThreadState");

        thread.start();

        while (true) {
            Thread.State state=thread.getState();
            System.out.println(state);
            if(state==Thread.State.TERMINATED)
            {
                System.out.println("Thread is terminated in while");
                break;
            }
            
        }}




    }


    
