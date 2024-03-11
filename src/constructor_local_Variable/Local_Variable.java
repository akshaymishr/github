package constructor_local_Variable;

public class Local_Variable
{
	
	Local_Variable()
	{
		System.out.println("Local_Variable Constructor");
	}
	static void add() 
	{
		int a=100;
		int a1=200;
		System.out.println(a+a1);
	}
	void subtract()
	{
		int a=100;
		int a1=200;
		System.out.println(a-a1);
	}
	void subtract(int age, String name,char gender)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}
	
	public static void main(String[] args)
	{
		new Local_Variable();
		add();
		Local_Variable L1=new Local_Variable();
		L1.subtract();
		L1.subtract(21, "akshay", 'M');
		
	}

}
