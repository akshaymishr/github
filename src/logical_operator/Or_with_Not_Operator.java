package logical_operator;

public class Or_with_Not_Operator 
{

	public static void main(String[] args)
	{
		int age=19;
		int salary=20000;
		if(!(age>18||salary==10000))
		{
			System.out.println("Be Ready");
		}
		else
		{
			System.out.println("Not ready");
		}

	}

}
