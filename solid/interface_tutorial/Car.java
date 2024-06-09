package solid.interface_tutorial;

public class Car implements Engine,Brake {
 int carvalue=599;
    @Override
    public void brake()
    {
        System.out.println("Brake");
    }
    
    @Override
    public void start()
    {
        System.out.println("Start");
    }
    @Override
    public void stop()
    {
        System.out.println("stop");
    }
    @Override
    public void accelerate()
    {
        System.out.println("accelerate");
    }
}
