package inheritance;
class Parent_Class
{
	static void multiplication(int a,int b)
	{
		System.out.println(a*b);
		
	}
	
}
public class Inhertance_Class1 extends Parent_Class  // Child class
{
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static void sub(int a, int b) 
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		add(-74,54);
		sub(74,85);
		multiplication(12,10);
		
		
	}

}
