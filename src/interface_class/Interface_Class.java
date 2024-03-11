package interface_class;
interface one
{
	void add();
	void subtract();
}
public class Interface_Class implements one

{
	void areaofrectangle()
	{
		System.out.println("aofr");
	}
	static void circleofarea()
	{
		System.out.println("cofa");
	}

	public static void main(String[] args)
	{
		Interface_Class i1=new Interface_Class();
		i1.add();
		i1.subtract();
		i1.areaofrectangle();
		circleofarea();
	}

	
	public void add()
	{
		System.out.println("The Real Logic can be here");
	}

	
	public void subtract() 
	{
		
		System.out.println("The Real Logic");
	}

}
