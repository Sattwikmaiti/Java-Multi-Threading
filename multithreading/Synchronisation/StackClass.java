package Synchronisation;



public class StackClass {

    private  int[] array;
    private  int stackTop;

    // initializing the stack with size and stackTop =-1 ,no elements
    public StackClass(int size) {
        array = new int[size];
        stackTop = -1;
    }

    public  boolean isEmpty() {
        return stackTop == -1;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int value) {

        synchronized (this) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        // delay to understand sync

        try {
            // sleep for 3000 ms
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Backchodi hogaya in push");
        }  

        array[++stackTop] = value;
        System.out.println("Pushed " + value + " to stack");
        return true;   
    }
    }

    public int pop() {

        synchronized (this) {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
    
            try {
                // sleep for 3000 ms
                Thread.sleep(3000);
    
            } catch (Exception e) {
    
                System.out.println("Backchodi hogaya in pop");
                
            }
            
            int value = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            System.out.println("Popped " + value + " from stack");
    
            stackTop--;
    
            return value;
            
        }
       
    }



/* 
static synchronized methods are actually written as className.class as locks 
since there is no concept of objects here. And static method can only call static methods ans varia\bels

    public static int popstatic() {

        synchronized (StackClass.class) {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
    
            try {
                // sleep for 3000 ms
                Thread.sleep(3000);
    
            } catch (Exception e) {
    
                System.out.println("Backchodi hogaya in pop");
                
            }
            
            int value = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            System.out.println("Popped " + value + " from stack");
    
            stackTop--;
    
            return value;
            
        }
       
    }
}

*/

}