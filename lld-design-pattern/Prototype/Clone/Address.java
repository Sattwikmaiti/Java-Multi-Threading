package Prototype.Clone;

public class Address implements Cloneable{
    String street;
   
    
    public Address(String street) {
        this.street = street;
       
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
    
}
