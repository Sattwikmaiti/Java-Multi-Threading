package solid.abstract_overriding;
public class Son extends Abstractparent {


    public Son(int age)
    {
        // super keyword is used 
        super(age);
    }

    @Override
    void career()
    {
        System.out.println("Son wants to become a doctor");
    }
    
    @Override
    void partner()
    {
        System.out.println("Son wants to have children");
    }
    
    




}









