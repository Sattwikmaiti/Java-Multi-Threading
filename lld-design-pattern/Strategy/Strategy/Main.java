package Strategy.Strategy;

public class Main {
    
    public static void main(String[] args) {
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle f1RoadVehicle = new F1RoadVehicle();
        
        offRoadVehicle.drive();
        f1RoadVehicle.drive();
    }
}
