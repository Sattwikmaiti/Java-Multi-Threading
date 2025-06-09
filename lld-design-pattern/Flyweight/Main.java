package Flyweight;

import java.io.IOException;

public class Main {

    public static void main(String args[])throws IOException
    {
        Robot human=RobotFactory.createRobot("HUMANOID");
        human.display(5,60);

        Robot dog=RobotFactory.createRobot("DOGOID");
        if(dog!=null)
         dog.display(14,22);

        Robot fu=RobotFactory.createRobot("DOGoOID");





    }





}
