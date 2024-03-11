package final_class;

public class Final_Global_Variable
{
	final static double pi=3.14;
	static void add()
	{
		int a=100; //final
		a=1000;
		System.out.println(a);	
	}

	public static void main(String[] args) 
	{
		add();
	}

}
