package solid.abstract_overriding;

public  abstract class Abstractparent {
    int age;
    //final variable needs to be initialized in constructor
    final int value;
    // constructor of a abstract class is possible
    public Abstractparent(int age)
    {
        this.age=age;
        value=age;
    }
   abstract void career();//string carrer
   abstract void partner();//string name,int age
    

   //Abstractparent obj =new Abstractparent(); object of abstract class not possible

   //abstract AbstractParent(int age) abstract constructor not possible


   public static void mom()
   {
    System.out.println("Call karo mommy ko");
   }
}