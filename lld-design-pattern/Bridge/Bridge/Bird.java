package Bridge.Bridge;

public class Bird extends LivingThings{
            
            public Bird(BreathingImplementer breathingImplementer){
                super(breathingImplementer);
            }
        
            @Override
            public void move() {
                System.out.println("Flying");
            }
            @Override
            public void breathingprocess() {
                breathingImplementer.breathe();
            }
    
}
