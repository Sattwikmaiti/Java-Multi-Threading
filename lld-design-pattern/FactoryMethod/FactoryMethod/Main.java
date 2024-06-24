
package FactoryMethod;
public class Main {

    public static void main(String args[])
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();




        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc.printDetails());
		System.out.println("Factory Server Config::"+server.printDetails());
    }



    
}
