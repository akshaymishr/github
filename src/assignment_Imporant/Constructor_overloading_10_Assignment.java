package assignment_Imporant;

public class Constructor_overloading_10_Assignment

{
	Constructor_overloading_10_Assignment()
	{
		System.out.println("1");
	}
	
	Constructor_overloading_10_Assignment(String a, int b)
	{
		System.out.println("2");
	}
	
	Constructor_overloading_10_Assignment(boolean a,int b)
	{
		System.out.println("3");
	}
	
	Constructor_overloading_10_Assignment(int a,char b)
	{
		System.out.println("4");
	}
	
	Constructor_overloading_10_Assignment(String a)
	{
		System.out.println("5");
	}
	
	Constructor_overloading_10_Assignment(double a,String b)
	{
		System.out.println("6");
	}
	
	Constructor_overloading_10_Assignment(String a,char b)
	{
		System.out.println("7");
	}
	
	Constructor_overloading_10_Assignment(int a,String b)
	{
		System.out.println("8");
	}
	
	Constructor_overloading_10_Assignment(char a,int b,String c)
	{
		System.out.println("9");
	}
	
	Constructor_overloading_10_Assignment(double a,boolean b,char c)
	{
		System.out.println("10");
	}
	
	public static void main(String[] args) 
	{
		new Constructor_overloading_10_Assignment();
		new Constructor_overloading_10_Assignment("aksahy",100);
		new Constructor_overloading_10_Assignment(true,200);
		new Constructor_overloading_10_Assignment(300,'M');
		new Constructor_overloading_10_Assignment("India");
		new Constructor_overloading_10_Assignment(2.22,"Humnabad");
		new Constructor_overloading_10_Assignment("AAA",'B');
		new Constructor_overloading_10_Assignment(400,"MM");
		new Constructor_overloading_10_Assignment('M',700,"kk");
		new Constructor_overloading_10_Assignment(123.2,false,'C');
	}

}
