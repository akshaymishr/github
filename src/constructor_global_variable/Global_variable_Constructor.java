package constructor_global_variable;

public class Global_variable_Constructor
{

	static int age;
	static double salary=9087.8;
	char gender='M';
	
	static void subtract()
	{
	  
		System.out.println(age);
		System.out.println(salary);
		
	}
	

	public static void main(String[] args) 
	{
		subtract();
		System.out.println(age);
		System.out.println(salary);
		Global_variable_Constructor G1=new Global_variable_Constructor();
		System.out.println(G1.gender);
		
	}

}
