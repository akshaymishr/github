package logical_operator;

public class Or_Operator
{

	public static void main(String[] args)
	{
		int age=19;
		char gender='M';
		if(age<18||gender=='C')
		{
			System.out.println("i am eligible to vote");
		}
		else
		{
			System.out.println("i am not eligible to vote");
		}

	}

}
