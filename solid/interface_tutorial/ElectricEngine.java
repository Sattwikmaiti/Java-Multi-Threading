package solid.interface_tutorial;

public class ElectricEngine implements Engine {

    @Override
    public void brake()
    {
        System.out.println("Brake for Elctric Engine");
    }
    
    @Override
    public void start()
    {
        System.out.println("Start for Electric Engine");
    }
    @Override
    public void stop()
    {
        System.out.println("stop for Electric Engine");
    }
    @Override
    public void accelerate()
    {
        System.out.println("accelerate for electric engine");
    }
    
}
