package solid.interface_tutorial;

public class Main {

    public static void main(String args[])
    {
        Car cc=new Car();
        cc.brake();
        cc.start();


        Engine cc1=new Car();
     //  System.out.print(cc1.carvalue) ;   car has carvalue , so can not be accessed as not defined in engine
     System.out.println("car value " + cc1.value) ;


     // NiceCar implementation

     NiceCar car=new NiceCar(new ElectricEngine());// parametrized 
     car.mediastart();
     car.enginestart();






    }
    
}
