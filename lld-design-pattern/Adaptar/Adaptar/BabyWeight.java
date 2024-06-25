package Adaptar.Adaptar;

public class BabyWeight implements WeightMachine{
    private double weightInPounds;
    public BabyWeight(double weightInPounds){
        this.weightInPounds = weightInPounds;
    }
    @Override
    public double getWeightInPounds(){
        return weightInPounds * 0.453592;
    }
    
}
