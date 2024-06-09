package solid.interface_tutorial;

public class NiceCar {

    private Engine engine;
    private Media media=new CDPlayer();

    public NiceCar(){
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine){
       this.engine=engine;
    }
    public void enginestart()
    {
        engine.start();
    }
    
    public void mediastart()
    {
        media.start();
    }
    
}
