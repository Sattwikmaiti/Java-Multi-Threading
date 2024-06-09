package solid.interface_tutorial;

public class PowerEngine implements Engine {

    @Override
    public void brake()
    {
        System.out.println("Brake for Power Engine");
    }
    
    @Override
    public void start()
    {
        System.out.println("Start for Power Engine");
    }
    @Override
    public void stop()
    {
        System.out.println("stop for Power Engine");
    }
    @Override
    public void accelerate()
    {
        System.out.println("accelerate for Power engine");
    }
    
}
