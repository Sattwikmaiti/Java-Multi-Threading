package Prototype.Clone;
// By implementing Cloneable interface 
// we make sure that instances of class A 
// can be cloned. 
class A implements Cloneable { 
	int i; //primitive datatypes
	String s; 

	// A class constructor 
	public A(int i, String s) 
	{ 
		this.i = i; 
		this.s = s; 
	} 

	// Overriding clone() method 
	// by simply calling Object class 
	// clone() method. Protected method so that it can be overridden.
	//super.clone() clone the object of the class 
	//return object
	@Override
	protected Object clone() 
		throws CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 
} 

public class ShallowClone { 
	public static void main(String[] args) 
		throws CloneNotSupportedException 
	{ 
		A a = new A(20, "GeeksForGeeks"); 

		// cloning 'a' and holding 
		// new cloned object reference in b 

		// down-casting as clone() return type is Object 
		A b = (A)a.clone(); 

		System.out.println(b.i); 
		System.out.println(b.s); 
	} 
}

/*
 * 
 * But Suppose have a Address address as userdefined class. 
 * And we are cloning the object of the class A.
 * then the reference of that field will be copied .
 * So we need to use deep cloning.
 * 
 * 
 * 
 */
