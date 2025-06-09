package Flyweight;


import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, Robot> cache= new HashMap<>();

    public  static Robot createRobot(String type)
    {
         if(cache.containsKey(type))
             return cache.get(type);

         if(type.equalsIgnoreCase("HUMANOID"))
         {
             Sprites human=new Sprites();
             Robot humanoid=new Humanoid(type,human);
             cache.put(type,humanoid);

             return humanoid;
         }
         else if(type.equalsIgnoreCase("DOGOID"))
         {

             Sprites human=new Sprites();
             Robot humanoid=new Dogoid(type,human);
             cache.put(type,humanoid);

             return humanoid;
         }


         System.out.println("Error "+type);
         return null;

    }
}
