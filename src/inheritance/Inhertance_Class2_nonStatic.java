package inheritance;
class Parent_Class3
{
	void multiplication(int a,int b)
	{
		System.out.println(a*b);
		
	}
}
public class Inhertance_Class2_nonStatic extends Parent_Class3 //Child Class
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sub(int a, int b) 
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		Inhertance_Class2_nonStatic i1=new Inhertance_Class2_nonStatic();
		i1.add(-74,54);
		i1.sub(74,85);
		i1.multiplication(12, 10);
		

	}

}
