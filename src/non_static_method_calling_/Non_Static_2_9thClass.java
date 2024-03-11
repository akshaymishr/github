package non_static_method_calling_;

public class Non_Static_2_9thClass 
{
			void add() 
			{
				int a=200;
				int b=100;
				System.out.println(a+b);
			}
			
		void multi()
		{
			int num3=200;
			int num4=300;
			System.out.println(num3*num4);
		}
	public static void main(String[] args) 
	{
		Non_Static_2_9thClass n1=new Non_Static_2_9thClass ();
		n1.add();
		subtract();
		n1.multi();
	}
		
	static void subtract()
	{
		int num1=400;
		int num2=300;
		System.out.println(num2-num1);
	}
}
