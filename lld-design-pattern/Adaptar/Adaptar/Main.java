package Adaptar.Adaptar;

public class Main {
    public static void main(String[] args) {
        BabyWeight babyWeight = new BabyWeight(10);
        WeightMachineAdaptar adaptar = new ConcreteAdaptar(babyWeight);
        System.out.println(adaptar.getWeightInKg());
    }
    
}
