package solid.abstract_overriding;
public class Daughter extends Abstractparent {


    public Daughter(int age)
    {
        super(age);
    }

    @Override
    void career()
    {
        System.out.println("Daughter wants to become a engineer");
    }
    
    @Override
    void partner()
    {
        System.out.println("Daughter wants to grow in career");
    }


}
    
    
