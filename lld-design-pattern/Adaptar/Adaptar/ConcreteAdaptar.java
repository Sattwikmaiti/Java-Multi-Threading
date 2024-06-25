package Adaptar.Adaptar;

//is-a and has-a WeightMachine
public class ConcreteAdaptar implements WeightMachineAdaptar {

   
    WeightMachine weightMachine;

    public ConcreteAdaptar(WeightMachine weightMachine) {
       
        this.weightMachine = weightMachine; 
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPounds() * 2.20462;
    }

    
}
