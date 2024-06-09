package solid.liskov;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)

    {


        List<Vehicle> vehicleList = new ArrayList<Vehicle>();

        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Bicycle());

        for ( Vehicle vehicle : vehicleList )
        {
            System.out.println("Engine ?"+vehicle.hasEngine().toString());//null pointer exception for bicycle
        }
    }
    
}
