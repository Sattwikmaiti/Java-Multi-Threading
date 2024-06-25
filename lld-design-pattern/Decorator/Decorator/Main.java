package Decorator.Decorator;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new VegDelight());
        System.out.println(pizza.getCost());
  // veg delight + extra cheese+ extra mushroom
  //First vegdelight (main pizza) is created then object is passed in extra cheese (constructor) is added then extra mushroom is added
        BasePizza pizza2 = new ExtraMushRoom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza2.getCost());
    }

    
}
