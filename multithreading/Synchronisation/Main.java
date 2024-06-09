package Synchronisation;

public class Main {

    public static void main(String[] args) {
        StackClass stk = new StackClass(10);
        /* 
        another method of calling java.Thread
         new Thread(new Runnable() {
            @Override
            public void run() {


                int counter=0;

                while(counter<5)
                  {
                      stack.pop();
                      counter++;
                  }
                
            }
        }).start();
*/

        new Thread(()-> {
            int counter=0;
    
            while(counter<10)
              {
                  stk.push(counter);
                  counter++;
              }
          
      },"Pushed").start();

        new Thread(()-> {
            int counter=0;

            while(counter<10)
              {
                  stk.pop();
                  counter++;
              }
          
      },"Poped").start();

     

        
      
    }
    
}

