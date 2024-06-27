package Prototype.Clone;




public class DeepClone {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123");
        Deep deep = new Deep(20, "GeeksForGeeks", address);
        System.out.println(deep.address);

        Deep deep2 = (Deep)deep.clone();
        deep2.address.street = "456";

        System.out.println(deep.address.street);
        System.out.println(deep2.address.street);
        
        
        
        
        
    }
}

class Deep implements Cloneable{
    Address address;
    int i;
    String s;
    
    public Deep(int i, String s, Address address) {
        this.i = i;
        this.s = s;
        this.address = address;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //deep cloning
        Deep deep = (Deep)super.clone();
        //now for every userdefined datatype call the clone method separately
        deep.address = (Address)address.clone();
        return deep;
    }
}

