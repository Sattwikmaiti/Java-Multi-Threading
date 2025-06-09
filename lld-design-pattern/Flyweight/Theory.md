Design a word processor or Game.
Its Structural Design Pattern
Helps to reduce **memory usage** by sharing data among multiple objects


# Game
Suppose we need to create a game with 5 lakh Humanoid and Dogoids.

# Error code

public class Sprites {
// the 2d bitimage or how the element will look . its very huge : 31kb
}

public class Robot{

//Intrinsic data : Those that once fixed will not change and can be shared

string type ; //1kb
Sprites sprite;//31kb
// Extrinsic data : these are got from client side and changes
int x,y; //1kb

Robot(param. constructor)
{ 
this.type = type ... etc
}

// getter and setter

}

int main()
{
 int x=0,y=0;

>> for(int i=1;i<=500000;i++)
{ Sprites human = new Sprites();
Robot humanoid =new Robot("HUMANOID",human,x,y);
x++;
y++;
}




// So here every time new object is created and huge memory used : (31kb+1+1+1)*10L = GB



# How to identify?

1. Memory is limited. 
2. Objects shared data (intrinsic and extrinsic)
3. object creation is costly // bitimage is very big

# Solution
1. Remove all extrinsic data and club the intrinsic data (flyweight objects)
as private and they should be only initialsed once . No setter method , so immutable.
2. The Extrinsic data is filled by method parameter passing. 
3. Flyweight objects once created , catched and stored.


>> Same thing is solved in https://www.youtube.com/watch?v=Mwm6tB3x1do&t=1s for Word Processor

