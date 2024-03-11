package interface_class;
interface ones
{
	void add();
	void subtract();
}
interface two extends ones
{
	void add1();
	void add2();
}

public class Interface_Class_2 implements two
{
	void circle()
	{
		
	}
	static void rectangle()
	{
		
	}

	public static void main(String[] args) 
	{
		Interface_Class_2 I1=new Interface_Class_2();
		I1.add();
		I1.subtract();
		I1.add1();
		I1.add2();
		I1.circle();
		I1.rectangle();
	
		
		
	}

	public void add() 
	{
		
		
	}

	public void subtract() 
	{
		
		
	}

	public void add1() 
	{
		
		
	}

	public void add2() 
	{
		
		
	}

}
