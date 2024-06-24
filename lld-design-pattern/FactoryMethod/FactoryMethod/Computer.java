package FactoryMethod;

public abstract class Computer {
	//All these abstract functions must be implemented by sybclasses extending this class
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	

	public String printDetails(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}