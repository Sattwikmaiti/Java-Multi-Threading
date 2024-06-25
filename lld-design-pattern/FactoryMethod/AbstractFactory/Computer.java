package AbstractFactory;

public abstract class Computer {
     //these abstract methods has to be written in the concrete classes which extends this class
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     //toString() gets called when in main we write System.out.printlm
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}