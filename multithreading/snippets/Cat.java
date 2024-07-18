
public class Cat extends Animal{
    
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " is eating fish");
  
    }
    
    public void dance() {
       super.dance();
    }

}