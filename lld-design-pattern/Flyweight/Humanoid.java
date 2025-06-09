package Flyweight;

public class Humanoid implements Robot{
//intrinsic data
 private String type;
 private Sprites humanSprite;
 public Humanoid(String type, Sprites humanSprite)
 {
     this.humanSprite=humanSprite;
     this.type=type;
 }
 public String getType()
    {
        return type;
    }
 public Sprites getHumanSprite()
 {
        return humanSprite;
 }

 // extrinsic getting method paramed
    @Override
    public void display(int x,int y)
    {
        System.out.println("Coordinate of Humanoid is "+x+" , "+y);
    }
}
