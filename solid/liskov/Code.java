// Base class
class Vehicle {
    public int getNumberOfWheels() {
        return 2; // Default implementation, overridden in subclasses
    }
}

// EngineVehicle class extending Vehicle
class EngineVehicle extends Vehicle {
    public boolean hasEngine() {
        return true;
    }
}

// Car class extending EngineVehicle and overriding getNumberOfWheels
class Car extends EngineVehicle {
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}

// Motorbike class extending EngineVehicle and overriding getNumberOfWheels
class Motorbike extends EngineVehicle {
    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}

// Bicycle class extending Vehicle
class Bicycle extends Vehicle {
    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorbike = new Motorbike();
        Vehicle bicycle = new Bicycle();

        System.out.println("Car has " + car.getNumberOfWheels() + " wheels.");
        System.out.println("Motorbike has " + motorbike.getNumberOfWheels() + " wheels.");
        System.out.println("Bicycle has " + bicycle.getNumberOfWheels() + " wheels.");

        EngineVehicle engineCar = new Car();
        EngineVehicle engineBike = new Motorbike();

        System.out.println("Car has an engine: " + engineCar.hasEngine());
        System.out.println("Motorbike has an engine: " + engineBike.hasEngine());
    }
}
