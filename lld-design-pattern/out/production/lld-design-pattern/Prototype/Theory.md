[Youtube](https://www.youtube.com/watch?v=rriiXRdc0HQ)

[GeeksForGeeks](https://www.geeksforgeeks.org/prototype-design-pattern/)
[RefactoringGuru](https://refactoring.guru/design-patterns/prototype/java/example)


# Java Cloneable Interface

> Reference Copy Approach.

`void main()
{   
    Student obj1=new Student("Sattwik",60);
     Student obj2=obj1;
    obj2.roll=4;
    }`

Both the objects point to the same new Student("Sattwik",60). So changing obj2.roll actuall changes the object value..so it reflects as obj1.roll and obj2.roll becomes 4.

To prevent this behaviour we user

> Object Copy : Shallow and Deep Copy

By Default if we use clone () , it returns shallow copy. 

So what we do : 
1. implement cloneable Interface
2. override clone method

WrongClone shows the wrong way of cloning. 

shallow copy : 
 primitive data types gets copied but the user-defined datatype are copied by reference . So 
 if any object tries to change userdefined attributes.The change is reflected everywhere.
 

// Overriding clone() method 
	// by simply calling Object class 
	// clone() method. Protected method so that it can be overridden.
	//super.clone() clone the object of the parent cloning class 
	//return object
	@Override
	protected Object clone() 
		throws CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 


    A a = new A(20, "GeeksForGeeks"); 

		// cloning 'a' and holding 
		// new cloned object reference in b 

		// down-casting as clone() return type is Object 
		A b = (A)a.clone(); 



Deep Copy . Here The object gets coppied . so any change in attributes (primitive and userdefined) doesnot reflect in other objects.

   `@Override
    protected Object clone() throws CloneNotSupportedException {
        //deep cloning
        Deep deep = (Deep)super.clone();
        //now for every userdefined datatype call the clone method separately
        //since return type is object . so down-casting
        deep.address = (Address)address.clone();
        return deep;
    }`
