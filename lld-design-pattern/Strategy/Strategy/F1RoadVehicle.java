package Strategy.Strategy;

public class F1RoadVehicle extends Vehicle{
        //super is used to call the constructor of the parent class
        public F1RoadVehicle() {
            super(new FastDrive());
        }
    
}
