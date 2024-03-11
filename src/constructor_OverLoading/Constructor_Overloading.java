package constructor_OverLoading;

public class Constructor_Overloading
{
	Constructor_Overloading()
	{
		System.out.println("1");
	}
	
	Constructor_Overloading(int a,int b,double c, char d)
	{
		System.out.println("2");
	}
	
	Constructor_Overloading(String a,int b)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		new Constructor_Overloading();
		new Constructor_Overloading(200,400,12.3,'S');
		new Constructor_Overloading("Akshay",989);
	}

}
