package solid.abstract_overriding;


public class AbstractMain{
    public static void main(String[] args)
    {  

        Son son = new Son(78);
        son.career();
       System.out.println("Son age is "+son.age);
       son.mom();

        Daughter child = new Daughter(24);
        child.career();
        System.out.println("Daughter age is "+child.age);
        
        

   

    }

}