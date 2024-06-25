package Bridge.Bridge;

public abstract class LivingThings{
  BreathingImplementer breathingImplementer;

    public LivingThings(BreathingImplementer breathingImplementer){
        this.breathingImplementer = breathingImplementer;
        
    }

    public abstract void move();
    public abstract void breathingprocess();
}