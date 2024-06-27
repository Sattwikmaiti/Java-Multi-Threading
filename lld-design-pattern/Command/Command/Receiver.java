package Command.Command;

public class Receiver {

    boolean isOn = false;
    int temperature;

    public void on() {
        isOn = true;
        System.out.println("Receiver is on");
    }

    public void off() {
        isOn = false;
        System.out.println("Receiver is off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is set to " + temperature);
    }
    
}
