package Decorator.Decorator;

public class ExtraMushRoom extends ToppingDecorator{
    
        
            
            
            BasePizza pizza;
                
            public ExtraMushRoom(BasePizza pizza){
                this.pizza = pizza;

            }

            @Override
            public double getCost(){
                return pizza.getCost() + 40;
            }



    
}
