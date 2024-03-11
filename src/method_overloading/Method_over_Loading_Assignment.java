package method_overloading;

public class Method_over_Loading_Assignment 
{
		static void add1(int a)
		{
			System.out.println("1st Static");
		}
		
		static void add1(double a, char b)
		{
			System.out.println("2st Static");
		}
		
		static void add1(String a, int b)
		{
			System.out.println("3st Static");
		}
		
		static void add1(boolean a,int b )
		{
			System.out.println("4st Static");
		}
		
		void add1(boolean a) 
		{
			System.out.println("Non Static 1st");
		}
		
		void add1(double a,boolean b) 
		{
			System.out.println("Non Static 2st");
		}
		
		void add1(char a, String b) 
		{
			System.out.println("Non Static 3st");
		}
		
		void add1(char c,int d,String e,boolean f,double g) 
		{
			System.out.println("Non Static 4st");
		}
		
	public static void main(String[] args) 
	{
		add1(200);
		add1(22.1,'M');
		add1("Akshay",400);
		add1(true,97561);
		
		Method_over_Loading_Assignment M1= new Method_over_Loading_Assignment ();
		M1.add1(false);
		M1.add1(9.9, false);
		M1.add1('C',"AS");
		M1.add1('N', 988, "MMM", false, 45.7);
	}

}
