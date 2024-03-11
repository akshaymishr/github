package sib_iib;

public class Sib_IIb_Constructor
{

	static 
	{
		System.out.println("SIB");
	}
	 Sib_IIb_Constructor()
	 {
		System.out.println("Constructor"); 
	 }
	 {
		 System.out.println("IIB");
	 }
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new  Sib_IIb_Constructor();

	}

}
