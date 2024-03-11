package sib_iib;

public class Siib_IIb_Constructor_Object2 
{
	
	static
	{
		System.out.println("SIB 1");
	}
	Siib_IIb_Constructor_Object2()
	{
		System.out.println("Constructor 2");
	}
	{
		System.out.println("IIB 3");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new Siib_IIb_Constructor_Object2();
		new Siib_IIb_Constructor_Object2();
		
	}

}
