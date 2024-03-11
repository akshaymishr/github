package non_static_method_calling_;

public class Non_Static_Call 
{
	void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("started");
		Non_Static_Call n1=new Non_Static_Call ();
		n1.add();
		n1.add1();
	}
	void add1()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}

}
