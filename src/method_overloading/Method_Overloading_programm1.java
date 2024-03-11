package method_overloading;

public class Method_Overloading_programm1 //Static method overload
{
	static void add() 
	{
		System.out.println("Method 1");
		
	}
	
	static void add(int a)
	{
		System.out.println("method 2");
	}
	
	static void add(char c,double b,String d)
	{
		System.out.println("method 3");
	}
	
	
	
	public static void main(String[] args)
	{
		add();
		add(100);
		add('A',234.5,"Akshay");
		
	}

}
