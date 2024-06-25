package Decorator.Decorator;

public class ExtraCheese  extends ToppingDecorator{

    
        // public ExtraCheese(BasePizza pizza){
        //     super(pizza);
        // }
        
        BasePizza pizza;
            
        public ExtraCheese(BasePizza pizza){
            this.pizza = pizza;
        }


        @Override
        public double getCost(){
            return pizza.getCost() + 50;
        }
    
}
