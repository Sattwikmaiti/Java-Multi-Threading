package Bridge.Bridge;

public class Fish extends LivingThings {

    public Fish(BreathingImplementer breathingImplementer) {
        super(breathingImplementer);
    }
    /*Same as the following code
     
     * BreathingImplementer breathingImplementer
     * 
     * public Fish(BreathingImplementer breathingImplementer){
     * this.breathingImplementer = breathingImplementer;
     * 
     * }
     * 
     * 
     */

    @Override
    public void move() {
        System.out.println("Swimming");
    }


     @Override
     public void breathingprocess() {
         breathingImplementer.breathe();
     }
}
