
package solid.abstract_overriding;
import java.util.Scanner;

public class overriding {
    
    public static void main(String[] args)  
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Value enter");
        int x=sc.nextInt();
             A a = new A();
            int val= a.getter(x);
            System.err.println("Val is " +val  );
            a.me();
B b=new B();
b.me();



            sc.close();
    }
}


class A {

    public int b;

    public int getter(int a)
    {
        this.b=a;
        return b;
    }
    protected void me()
    {
        System.out.println("A");
        return ;
    }
}


class B extends A {
   @Override
    protected void me()
    {
        System.out.println("B");
        return ;
    }

}
