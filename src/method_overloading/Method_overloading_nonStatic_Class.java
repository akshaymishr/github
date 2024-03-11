package method_overloading;

public class Method_overloading_nonStatic_Class 
{
	void add() 
	{
		System.out.println("Method 1");
		
	}
	
	 void add(int a)
	{
		System.out.println("method 2");
	}
	
	 static void add(char c,double b,String d)
	{
		System.out.println("method 3");
	}
	
	public static void main(String[] args)
	{
		Method_overloading_nonStatic_Class M1=new Method_overloading_nonStatic_Class();
		M1.add();
		M1.add(200);
		add('A',234.5,"Akshay");

	}

}
