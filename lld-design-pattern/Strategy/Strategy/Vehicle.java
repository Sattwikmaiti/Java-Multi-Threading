package Strategy.Strategy;

public class Vehicle {

    private DriveStrategy driveStrategy;
 // This is Constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

    
    
}
