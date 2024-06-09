package solid.interface_tutorial;

public class CDPlayer implements Media {

    @Override
    public void start()
    {
        System.out.println("Music Player chalao ");
    }
    @Override
    public void stop()
    {
        System.out.println("Music Player Band karo");
    }
    
}
