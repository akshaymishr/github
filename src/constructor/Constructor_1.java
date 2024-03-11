package constructor;

public class Constructor_1 
{
	
	Constructor_1() 
	{
		System.out.println("This is my Constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("this is my main method");
		Constructor_1 C1=new Constructor_1 ();
		
		new Constructor_1();
		//new Constructor_1();
		
	}
	

}
