package Flyweight;

public class Dogoid implements Robot{
    //intrinsic data
    private String type;
    private Sprites humanSprite; //this should be dogsprite
    public Dogoid(String type, Sprites humanSprite)
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
        System.out.println("Coordinate of Dogoid is "+x+" , "+y);
    }
}
