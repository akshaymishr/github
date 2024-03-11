package logical_operator;

public class And_with_Not_Operator 
{

	public static void main(String[] args)
	{
		int age=19;
		int salary=10000;
		if (!(age<18 ||salary==9000))
		{
			System.out.println("i m going to office");
		}
		else
		{
			System.out.println("i m not going to office");
		}
	}

}
