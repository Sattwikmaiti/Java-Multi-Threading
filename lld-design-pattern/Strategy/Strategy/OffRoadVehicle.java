package Strategy.Strategy;

public class OffRoadVehicle extends Vehicle{
        //super is used to call the constructor of the parent class
        public OffRoadVehicle() {
            super(new SportyDrive());
        }
    
}
