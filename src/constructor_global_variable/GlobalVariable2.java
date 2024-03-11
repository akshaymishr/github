package constructor_global_variable;

public class GlobalVariable2 
{
	String a="akshay";
	static String b="mishra";
	static int a1;
	double a2;
	static void add1() 
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		GlobalVariable2 G1=new GlobalVariable2();
		System.out.println(a1);
		System.out.println(G1.a2);
		
	}

}
