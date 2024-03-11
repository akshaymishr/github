package constructor_global_variable;

public class Global_Variable_Arithmatical_oper 
{
	static int number1=200;
	static int number2=300;
	
	static void add()
	{
		int sum=number1+number2;
		System.out.println(sum);
	}
	
	static void subtract()
	{
		int subtract=number1-number2;
		System.out.println(subtract);
	}
	static void multi()
	{
		int multi=number1*number2;
		System.out.println(multi);
	}
	static void divi()
	{
		
		int divi=number1/number2;
		System.out.println(divi);
	}
	
	static void modulus()
	{
		int modulus=number1%number2;
		System.out.println(modulus);
	}
	public static void main(String[] args) 
	{
		 add();
		 subtract();
		 multi();
		 divi();
		 modulus();
	}

}
