package Prototype.Prototype;
import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();



    /*
     * instanceof is used to compare whether an object is an instance of a class or an interface.
     * Here we are comparing whether the object2 is an instance of Shape class or not.
     * Else we are typecasting the object2 to Shape class and comparing the x, y and color of the object2 with the current object.
     * 
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        //comparing with this.x , this.y,this.color with shape2.x, shape2.y, shape2.color
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
