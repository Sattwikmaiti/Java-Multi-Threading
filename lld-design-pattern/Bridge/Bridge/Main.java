package Bridge.Bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreather());
        fish.move();
        fish.breathingprocess();
        
        
    }
}
